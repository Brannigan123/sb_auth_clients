//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of com.bran.auth.client;

class ResetUserPasswordRequest {
  /// Returns a new [ResetUserPasswordRequest] instance.
  ResetUserPasswordRequest({
    this.otpId,
    this.otpCode,
    this.emailOrUsername,
    this.password,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? otpId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? otpCode;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? emailOrUsername;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? password;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ResetUserPasswordRequest &&
    other.otpId == otpId &&
    other.otpCode == otpCode &&
    other.emailOrUsername == emailOrUsername &&
    other.password == password;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (otpId == null ? 0 : otpId!.hashCode) +
    (otpCode == null ? 0 : otpCode!.hashCode) +
    (emailOrUsername == null ? 0 : emailOrUsername!.hashCode) +
    (password == null ? 0 : password!.hashCode);

  @override
  String toString() => 'ResetUserPasswordRequest[otpId=$otpId, otpCode=$otpCode, emailOrUsername=$emailOrUsername, password=$password]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.otpId != null) {
      json[r'otpId'] = this.otpId;
    } else {
      json[r'otpId'] = null;
    }
    if (this.otpCode != null) {
      json[r'otpCode'] = this.otpCode;
    } else {
      json[r'otpCode'] = null;
    }
    if (this.emailOrUsername != null) {
      json[r'emailOrUsername'] = this.emailOrUsername;
    } else {
      json[r'emailOrUsername'] = null;
    }
    if (this.password != null) {
      json[r'password'] = this.password;
    } else {
      json[r'password'] = null;
    }
    return json;
  }

  /// Returns a new [ResetUserPasswordRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ResetUserPasswordRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ResetUserPasswordRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ResetUserPasswordRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ResetUserPasswordRequest(
        otpId: mapValueOfType<String>(json, r'otpId'),
        otpCode: mapValueOfType<String>(json, r'otpCode'),
        emailOrUsername: mapValueOfType<String>(json, r'emailOrUsername'),
        password: mapValueOfType<String>(json, r'password'),
      );
    }
    return null;
  }

  static List<ResetUserPasswordRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ResetUserPasswordRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ResetUserPasswordRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ResetUserPasswordRequest> mapFromJson(dynamic json) {
    final map = <String, ResetUserPasswordRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ResetUserPasswordRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ResetUserPasswordRequest-objects as value to a dart map
  static Map<String, List<ResetUserPasswordRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ResetUserPasswordRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ResetUserPasswordRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

