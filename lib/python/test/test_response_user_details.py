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

from authclient.models.response_user_details import ResponseUserDetails  # noqa: E501

class TestResponseUserDetails(unittest.TestCase):
    """ResponseUserDetails unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ResponseUserDetails:
        """Test ResponseUserDetails
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ResponseUserDetails`
        """
        model = ResponseUserDetails()  # noqa: E501
        if include_optional:
            return ResponseUserDetails(
                user_id = '',
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
            return ResponseUserDetails(
        )
        """

    def testResponseUserDetails(self):
        """Test ResponseUserDetails"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
