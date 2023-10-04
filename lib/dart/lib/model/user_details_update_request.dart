//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of com.bran.auth.client;

class UserDetailsUpdateRequest {
  /// Returns a new [UserDetailsUpdateRequest] instance.
  UserDetailsUpdateRequest({
    this.otpId,
    this.otpCode,
    this.displayName,
    this.email,
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
  String? displayName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? email;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? password;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UserDetailsUpdateRequest &&
    other.otpId == otpId &&
    other.otpCode == otpCode &&
    other.displayName == displayName &&
    other.email == email &&
    other.password == password;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (otpId == null ? 0 : otpId!.hashCode) +
    (otpCode == null ? 0 : otpCode!.hashCode) +
    (displayName == null ? 0 : displayName!.hashCode) +
    (email == null ? 0 : email!.hashCode) +
    (password == null ? 0 : password!.hashCode);

  @override
  String toString() => 'UserDetailsUpdateRequest[otpId=$otpId, otpCode=$otpCode, displayName=$displayName, email=$email, password=$password]';

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
    if (this.displayName != null) {
      json[r'displayName'] = this.displayName;
    } else {
      json[r'displayName'] = null;
    }
    if (this.email != null) {
      json[r'email'] = this.email;
    } else {
      json[r'email'] = null;
    }
    if (this.password != null) {
      json[r'password'] = this.password;
    } else {
      json[r'password'] = null;
    }
    return json;
  }

  /// Returns a new [UserDetailsUpdateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UserDetailsUpdateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UserDetailsUpdateRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UserDetailsUpdateRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UserDetailsUpdateRequest(
        otpId: mapValueOfType<String>(json, r'otpId'),
        otpCode: mapValueOfType<String>(json, r'otpCode'),
        displayName: mapValueOfType<String>(json, r'displayName'),
        email: mapValueOfType<String>(json, r'email'),
        password: mapValueOfType<String>(json, r'password'),
      );
    }
    return null;
  }

  static List<UserDetailsUpdateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UserDetailsUpdateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UserDetailsUpdateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UserDetailsUpdateRequest> mapFromJson(dynamic json) {
    final map = <String, UserDetailsUpdateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UserDetailsUpdateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UserDetailsUpdateRequest-objects as value to a dart map
  static Map<String, List<UserDetailsUpdateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UserDetailsUpdateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UserDetailsUpdateRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

