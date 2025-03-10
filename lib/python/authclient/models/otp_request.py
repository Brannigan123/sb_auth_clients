# coding: utf-8

"""
    API for AuthApplication

    Bran's Auth API

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import Optional
from pydantic import BaseModel, Field, StrictStr

class OtpRequest(BaseModel):
    """
    OtpRequest
    """
    email_or_username: Optional[StrictStr] = Field(None, alias="emailOrUsername")
    message: Optional[StrictStr] = None
    __properties = ["emailOrUsername", "message"]

    class Config:
        """Pydantic configuration"""
        allow_population_by_field_name = True
        validate_assignment = True

    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.dict(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> OtpRequest:
        """Create an instance of OtpRequest from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> OtpRequest:
        """Create an instance of OtpRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return OtpRequest.parse_obj(obj)

        _obj = OtpRequest.parse_obj({
            "email_or_username": obj.get("emailOrUsername"),
            "message": obj.get("message")
        })
        return _obj


