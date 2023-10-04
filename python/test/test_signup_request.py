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

from authclient.models.signup_request import SignupRequest  # noqa: E501

class TestSignupRequest(unittest.TestCase):
    """SignupRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> SignupRequest:
        """Test SignupRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `SignupRequest`
        """
        model = SignupRequest()  # noqa: E501
        if include_optional:
            return SignupRequest(
                username = '',
                display_name = '',
                email = '',
                password = ''
            )
        else:
            return SignupRequest(
        )
        """

    def testSignupRequest(self):
        """Test SignupRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
