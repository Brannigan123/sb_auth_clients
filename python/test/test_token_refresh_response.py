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

from authclient.models.token_refresh_response import TokenRefreshResponse  # noqa: E501

class TestTokenRefreshResponse(unittest.TestCase):
    """TokenRefreshResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> TokenRefreshResponse:
        """Test TokenRefreshResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `TokenRefreshResponse`
        """
        model = TokenRefreshResponse()  # noqa: E501
        if include_optional:
            return TokenRefreshResponse(
                errored = True,
                messages = [
                    ''
                    ],
                token = '',
                refresh_token = '',
                username = '',
                display_name = '',
                email = '',
                roles = [
                    authclient.models.role.Role(
                        id = '', 
                        name = '', 
                        permissions = [
                            authclient.models.permission.Permission(
                                id = '', 
                                name = '', 
                                roles = [
                                    authclient.models.role.Role(
                                        id = '', 
                                        name = '', 
                                        authority = '', )
                                    ], 
                                authority = '', )
                            ], 
                        authority = '', )
                    ],
                email_verified = True,
                locked_account = True,
                deleted_account = True
            )
        else:
            return TokenRefreshResponse(
        )
        """

    def testTokenRefreshResponse(self):
        """Test TokenRefreshResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
