# coding: utf-8

"""
    API for AuthApplication

    Bran's Auth API

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from authclient.models.reset_user_password_request import ResetUserPasswordRequest  # noqa: E501

class TestResetUserPasswordRequest(unittest.TestCase):
    """ResetUserPasswordRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ResetUserPasswordRequest:
        """Test ResetUserPasswordRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ResetUserPasswordRequest`
        """
        model = ResetUserPasswordRequest()  # noqa: E501
        if include_optional:
            return ResetUserPasswordRequest(
                otp_id = '',
                otp_code = '',
                email_or_username = '',
                password = ''
            )
        else:
            return ResetUserPasswordRequest(
        )
        """

    def testResetUserPasswordRequest(self):
        """Test ResetUserPasswordRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
