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
pub struct ResetUserPasswordRequest {
    #[serde(rename = "otpId", skip_serializing_if = "Option::is_none")]
    pub otp_id: Option<String>,
    #[serde(rename = "otpCode", skip_serializing_if = "Option::is_none")]
    pub otp_code: Option<String>,
    #[serde(rename = "emailOrUsername", skip_serializing_if = "Option::is_none")]
    pub email_or_username: Option<String>,
    #[serde(rename = "password", skip_serializing_if = "Option::is_none")]
    pub password: Option<String>,
}

impl ResetUserPasswordRequest {
    pub fn new() -> ResetUserPasswordRequest {
        ResetUserPasswordRequest {
            otp_id: None,
            otp_code: None,
            email_or_username: None,
            password: None,
        }
    }
}


