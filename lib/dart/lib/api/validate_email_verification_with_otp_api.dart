//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of com.bran.auth.client;


class ValidateEmailVerificationWithOtpApi {
  ValidateEmailVerificationWithOtpApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Performs an HTTP 'POST /api/v1/auth/public/validate-email-verification-otp' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [EmailConfirmationOtpSubmitRequest] emailConfirmationOtpSubmitRequest (required):
  Future<Response> valilidateEmailVerificationOtpWithHttpInfo(EmailConfirmationOtpSubmitRequest emailConfirmationOtpSubmitRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/api/v1/auth/public/validate-email-verification-otp';

    // ignore: prefer_final_locals
    Object? postBody = emailConfirmationOtpSubmitRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Parameters:
  ///
  /// * [EmailConfirmationOtpSubmitRequest] emailConfirmationOtpSubmitRequest (required):
  Future<AuthResponse?> valilidateEmailVerificationOtp(EmailConfirmationOtpSubmitRequest emailConfirmationOtpSubmitRequest,) async {
    final response = await valilidateEmailVerificationOtpWithHttpInfo(emailConfirmationOtpSubmitRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AuthResponse',) as AuthResponse;
    
    }
    return null;
  }
}
