//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of com.bran.auth.client;


class SignoutApi {
  SignoutApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Performs an HTTP 'POST /api/v1/auth/authenticated/logout' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [SignoutRequest] signoutRequest (required):
  Future<Response> signoutWithHttpInfo(SignoutRequest signoutRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/api/v1/auth/authenticated/logout';

    // ignore: prefer_final_locals
    Object? postBody = signoutRequest;

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
  /// * [SignoutRequest] signoutRequest (required):
  Future<ApiResponse?> signout(SignoutRequest signoutRequest,) async {
    final response = await signoutWithHttpInfo(signoutRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ApiResponse',) as ApiResponse;
    
    }
    return null;
  }
}
