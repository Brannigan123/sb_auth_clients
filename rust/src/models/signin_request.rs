/*
 * API for AuthApplication
 *
 * Bran's Auth API
 *
 * The version of the OpenAPI document: 1.0
 * 
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct SigninRequest {
    #[serde(rename = "emailOrUsername", skip_serializing_if = "Option::is_none")]
    pub email_or_username: Option<String>,
    #[serde(rename = "password", skip_serializing_if = "Option::is_none")]
    pub password: Option<String>,
}

impl SigninRequest {
    pub fn new() -> SigninRequest {
        SigninRequest {
            email_or_username: None,
            password: None,
        }
    }
}


