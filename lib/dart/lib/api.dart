//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

library com.bran.auth.client;

import 'dart:async';
import 'dart:convert';
import 'dart:io';

import 'package:collection/collection.dart';
import 'package:http/http.dart';
import 'package:intl/intl.dart';
import 'package:meta/meta.dart';

part 'api_client.dart';
part 'api_helper.dart';
part 'api_exception.dart';
part 'auth/authentication.dart';
part 'auth/api_key_auth.dart';
part 'auth/oauth.dart';
part 'auth/http_basic_auth.dart';
part 'auth/http_bearer_auth.dart';

part 'api/authenticate_api.dart';
part 'api/refresh_token_api.dart';
part 'api/register_api.dart';
part 'api/reset_user_password_api.dart';
part 'api/send_custom_email_verification_api.dart';
part 'api/send_email_verification_mail_api.dart';
part 'api/signout_api.dart';
part 'api/update_user_details_api.dart';
part 'api/validate_email_verification_with_otp_api.dart';

part 'model/auth_response.dart';
part 'model/email_confirmation_otp_submit_request.dart';
part 'model/model_date.dart';
part 'model/otp_request.dart';
part 'model/otp_request_response.dart';
part 'model/permission.dart';
part 'model/reset_user_password_request.dart';
part 'model/response_user_details.dart';
part 'model/role.dart';
part 'model/signin_request.dart';
part 'model/signout_request.dart';
part 'model/signup_request.dart';
part 'model/token_refresh_request.dart';
part 'model/user_details_update_request.dart';


/// An [ApiClient] instance that uses the default values obtained from
/// the OpenAPI specification file.
var defaultApiClient = ApiClient();

const _delimiters = {'csv': ',', 'ssv': ' ', 'tsv': '\t', 'pipes': '|'};
const _dateEpochMarker = 'epoch';
const _deepEquality = DeepCollectionEquality();
final _dateFormatter = DateFormat('yyyy-MM-dd');
final _regList = RegExp(r'^List<(.*)>$');
final _regSet = RegExp(r'^Set<(.*)>$');
final _regMap = RegExp(r'^Map<String,(.*)>$');

bool _isEpochMarker(String? pattern) => pattern == _dateEpochMarker || pattern == '/$_dateEpochMarker/';
