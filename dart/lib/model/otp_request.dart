//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of com.bran.auth.client;

class OtpRequest {
  /// Returns a new [OtpRequest] instance.
  OtpRequest({
    this.emailOrUsername,
    this.message,
  });

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
  String? message;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OtpRequest &&
    other.emailOrUsername == emailOrUsername &&
    other.message == message;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (emailOrUsername == null ? 0 : emailOrUsername!.hashCode) +
    (message == null ? 0 : message!.hashCode);

  @override
  String toString() => 'OtpRequest[emailOrUsername=$emailOrUsername, message=$message]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.emailOrUsername != null) {
      json[r'emailOrUsername'] = this.emailOrUsername;
    } else {
      json[r'emailOrUsername'] = null;
    }
    if (this.message != null) {
      json[r'message'] = this.message;
    } else {
      json[r'message'] = null;
    }
    return json;
  }

  /// Returns a new [OtpRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OtpRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OtpRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OtpRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OtpRequest(
        emailOrUsername: mapValueOfType<String>(json, r'emailOrUsername'),
        message: mapValueOfType<String>(json, r'message'),
      );
    }
    return null;
  }

  static List<OtpRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OtpRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OtpRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OtpRequest> mapFromJson(dynamic json) {
    final map = <String, OtpRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OtpRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OtpRequest-objects as value to a dart map
  static Map<String, List<OtpRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OtpRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OtpRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

