# coding: utf-8

"""
    API for AuthApplication

    Bran's Auth API

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from authclient.api.send_email_verification_mail_api import SendEmailVerificationMailApi  # noqa: E501


class TestSendEmailVerificationMailApi(unittest.TestCase):
    """SendEmailVerificationMailApi unit test stubs"""

    def setUp(self) -> None:
        self.api = SendEmailVerificationMailApi()  # noqa: E501

    def tearDown(self) -> None:
        pass

    def test_send_verification_email(self) -> None:
        """Test case for send_verification_email

        """
        pass


if __name__ == '__main__':
    unittest.main()
