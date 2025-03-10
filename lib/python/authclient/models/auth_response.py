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


from typing import List, Optional
from pydantic import BaseModel, Field, StrictBool, StrictStr, conlist
from authclient.models.response_user_details import ResponseUserDetails

class AuthResponse(BaseModel):
    """
    AuthResponse
    """
    errored: Optional[StrictBool] = None
    messages: Optional[conlist(StrictStr)] = None
    token: Optional[StrictStr] = None
    refresh_token: Optional[StrictStr] = Field(None, alias="refreshToken")
    user_details: Optional[ResponseUserDetails] = Field(None, alias="userDetails")
    __properties = ["errored", "messages", "token", "refreshToken", "userDetails"]

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
    def from_json(cls, json_str: str) -> AuthResponse:
        """Create an instance of AuthResponse from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of user_details
        if self.user_details:
            _dict['userDetails'] = self.user_details.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> AuthResponse:
        """Create an instance of AuthResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return AuthResponse.parse_obj(obj)

        _obj = AuthResponse.parse_obj({
            "errored": obj.get("errored"),
            "messages": obj.get("messages"),
            "token": obj.get("token"),
            "refresh_token": obj.get("refreshToken"),
            "user_details": ResponseUserDetails.from_dict(obj.get("userDetails")) if obj.get("userDetails") is not None else None
        })
        return _obj


