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
pub struct TokenRefreshResponse {
    #[serde(rename = "errored", skip_serializing_if = "Option::is_none")]
    pub errored: Option<bool>,
    #[serde(rename = "messages", skip_serializing_if = "Option::is_none")]
    pub messages: Option<Vec<String>>,
    #[serde(rename = "token", skip_serializing_if = "Option::is_none")]
    pub token: Option<String>,
    #[serde(rename = "refreshToken", skip_serializing_if = "Option::is_none")]
    pub refresh_token: Option<String>,
    #[serde(rename = "username", skip_serializing_if = "Option::is_none")]
    pub username: Option<String>,
    #[serde(rename = "displayName", skip_serializing_if = "Option::is_none")]
    pub display_name: Option<String>,
    #[serde(rename = "email", skip_serializing_if = "Option::is_none")]
    pub email: Option<String>,
    #[serde(rename = "roles", skip_serializing_if = "Option::is_none")]
    pub roles: Option<Vec<crate::models::Role>>,
    #[serde(rename = "emailVerified", skip_serializing_if = "Option::is_none")]
    pub email_verified: Option<bool>,
    #[serde(rename = "lockedAccount", skip_serializing_if = "Option::is_none")]
    pub locked_account: Option<bool>,
    #[serde(rename = "deletedAccount", skip_serializing_if = "Option::is_none")]
    pub deleted_account: Option<bool>,
}

impl TokenRefreshResponse {
    pub fn new() -> TokenRefreshResponse {
        TokenRefreshResponse {
            errored: None,
            messages: None,
            token: None,
            refresh_token: None,
            username: None,
            display_name: None,
            email: None,
            roles: None,
            email_verified: None,
            locked_account: None,
            deleted_account: None,
        }
    }
}


