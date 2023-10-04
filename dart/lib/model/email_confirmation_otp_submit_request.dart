//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of com.bran.auth.client;

class EmailConfirmationOtpSubmitRequest {
  /// Returns a new [EmailConfirmationOtpSubmitRequest] instance.
  EmailConfirmationOtpSubmitRequest({
    this.otpId,
    this.code,
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
  String? code;

  @override
  bool operator ==(Object other) => identical(this, other) || other is EmailConfirmationOtpSubmitRequest &&
    other.otpId == otpId &&
    other.code == code;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (otpId == null ? 0 : otpId!.hashCode) +
    (code == null ? 0 : code!.hashCode);

  @override
  String toString() => 'EmailConfirmationOtpSubmitRequest[otpId=$otpId, code=$code]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.otpId != null) {
      json[r'otpId'] = this.otpId;
    } else {
      json[r'otpId'] = null;
    }
    if (this.code != null) {
      json[r'code'] = this.code;
    } else {
      json[r'code'] = null;
    }
    return json;
  }

  /// Returns a new [EmailConfirmationOtpSubmitRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static EmailConfirmationOtpSubmitRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "EmailConfirmationOtpSubmitRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "EmailConfirmationOtpSubmitRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return EmailConfirmationOtpSubmitRequest(
        otpId: mapValueOfType<String>(json, r'otpId'),
        code: mapValueOfType<String>(json, r'code'),
      );
    }
    return null;
  }

  static List<EmailConfirmationOtpSubmitRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <EmailConfirmationOtpSubmitRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = EmailConfirmationOtpSubmitRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, EmailConfirmationOtpSubmitRequest> mapFromJson(dynamic json) {
    final map = <String, EmailConfirmationOtpSubmitRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = EmailConfirmationOtpSubmitRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of EmailConfirmationOtpSubmitRequest-objects as value to a dart map
  static Map<String, List<EmailConfirmationOtpSubmitRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<EmailConfirmationOtpSubmitRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = EmailConfirmationOtpSubmitRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

