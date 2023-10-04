//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of com.bran.auth.client;

class AuthResponse {
  /// Returns a new [AuthResponse] instance.
  AuthResponse({
    this.errored,
    this.messages = const [],
    this.token,
    this.refreshToken,
    this.userDetails,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? errored;

  List<String> messages;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? token;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? refreshToken;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ResponseUserDetails? userDetails;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AuthResponse &&
    other.errored == errored &&
    _deepEquality.equals(other.messages, messages) &&
    other.token == token &&
    other.refreshToken == refreshToken &&
    other.userDetails == userDetails;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (errored == null ? 0 : errored!.hashCode) +
    (messages.hashCode) +
    (token == null ? 0 : token!.hashCode) +
    (refreshToken == null ? 0 : refreshToken!.hashCode) +
    (userDetails == null ? 0 : userDetails!.hashCode);

  @override
  String toString() => 'AuthResponse[errored=$errored, messages=$messages, token=$token, refreshToken=$refreshToken, userDetails=$userDetails]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.errored != null) {
      json[r'errored'] = this.errored;
    } else {
      json[r'errored'] = null;
    }
      json[r'messages'] = this.messages;
    if (this.token != null) {
      json[r'token'] = this.token;
    } else {
      json[r'token'] = null;
    }
    if (this.refreshToken != null) {
      json[r'refreshToken'] = this.refreshToken;
    } else {
      json[r'refreshToken'] = null;
    }
    if (this.userDetails != null) {
      json[r'userDetails'] = this.userDetails;
    } else {
      json[r'userDetails'] = null;
    }
    return json;
  }

  /// Returns a new [AuthResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AuthResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AuthResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AuthResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AuthResponse(
        errored: mapValueOfType<bool>(json, r'errored'),
        messages: json[r'messages'] is Iterable
            ? (json[r'messages'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        token: mapValueOfType<String>(json, r'token'),
        refreshToken: mapValueOfType<String>(json, r'refreshToken'),
        userDetails: ResponseUserDetails.fromJson(json[r'userDetails']),
      );
    }
    return null;
  }

  static List<AuthResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AuthResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AuthResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AuthResponse> mapFromJson(dynamic json) {
    final map = <String, AuthResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AuthResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AuthResponse-objects as value to a dart map
  static Map<String, List<AuthResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AuthResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AuthResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

