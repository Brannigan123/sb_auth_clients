//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of com.bran.auth.client;


class ResetUserPasswordApi {
  ResetUserPasswordApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Performs an HTTP 'POST /api/v1/auth/public/reset-password' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [ResetUserPasswordRequest] resetUserPasswordRequest (required):
  Future<Response> resetUserPasswordWithHttpInfo(ResetUserPasswordRequest resetUserPasswordRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/api/v1/auth/public/reset-password';

    // ignore: prefer_final_locals
    Object? postBody = resetUserPasswordRequest;

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
  /// * [ResetUserPasswordRequest] resetUserPasswordRequest (required):
  Future<AuthResponse?> resetUserPassword(ResetUserPasswordRequest resetUserPasswordRequest,) async {
    final response = await resetUserPasswordWithHttpInfo(resetUserPasswordRequest,);
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
