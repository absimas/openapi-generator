/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.swagger.client.model
import play.api.libs.json._
import java.io.File

case class InlineObject1 (
            /* Additional data to pass to server */
                  additionalMetadata: Option[String],
            /* file to upload */
                  file: Option[File]
)

object InlineObject1 {
implicit val format: Format[InlineObject1] = Json.format
}
