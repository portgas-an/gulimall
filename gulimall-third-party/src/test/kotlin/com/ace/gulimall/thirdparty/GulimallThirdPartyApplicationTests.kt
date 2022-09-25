package com.ace.gulimall.thirdparty

import com.ace.gulimall.thirdparty.config.OssConfig
import com.tencent.cloud.CosStsClient
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.util.*

@SpringBootTest
class GulimallThirdPartyApplicationTests {

	@Autowired
	private lateinit var ossConfig: OssConfig

	@Test
	fun contextLoads() {

		val config = TreeMap<String, Any>()

		try {

			// 云 api 密钥 SecretId
			config["secretId"] = ossConfig.secretId
			// 云 api 密钥 SecretKey
			config["secretKey"] = ossConfig.secretKey

			// 临时密钥有效时长，单位是秒
			config["durationSeconds"] = 1800

			// 换成你的 bucket
			config["bucket"] = ossConfig.bucketName
			// 换成 bucket 所在地区
			config["region"] = ossConfig.area

			// 可以通过 allowPrefixes 指定前缀数组, 例子： a.jpg 或者 a/* 或者 * (使用通配符*存在重大安全风险, 请谨慎评估使用)
			config["allowPrefixes"] = arrayOf("*")

			// 密钥的权限列表。简单上传和分片需要以下的权限，其他权限列表请看 https://cloud.tencent.com/document/product/436/31923
			val allowActions = arrayOf( // 简单上传
				"name/cos:PutObject",
				"name/cos:PostObject",  // 分片上传
				"name/cos:InitiateMultipartUpload",
				"name/cos:ListMultipartUploads",
				"name/cos:ListParts",
				"name/cos:UploadPart",
				"name/cos:CompleteMultipartUpload"
			)
			config["allowActions"] = allowActions
			val response = CosStsClient.getCredential(config)
			System.out.println(response.credentials.tmpSecretId)
			System.out.println(response.credentials.tmpSecretKey)
			System.out.println(response.credentials.sessionToken)
		} catch (e: Exception) {
			e.printStackTrace()
			throw IllegalArgumentException("no valid secret !")
		}
	}

}
