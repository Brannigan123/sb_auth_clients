# coding: utf-8

"""
    API for AuthApplication

    Bran's Auth API

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from authclient.api.authenticate_api import AuthenticateApi  # noqa: E501


class TestAuthenticateApi(unittest.TestCase):
    """AuthenticateApi unit test stubs"""

    def setUp(self) -> None:
        self.api = AuthenticateApi()  # noqa: E501

    def tearDown(self) -> None:
        pass

    def test_authenticate(self) -> None:
        """Test case for authenticate

        """
        pass


if __name__ == '__main__':
    unittest.main()