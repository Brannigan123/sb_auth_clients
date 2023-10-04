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
from authclient.models.role import Role

class SignupResponse(BaseModel):
    """
    SignupResponse
    """
    errored: Optional[StrictBool] = None
    messages: Optional[conlist(StrictStr)] = None
    token: Optional[StrictStr] = None
    refresh_token: Optional[StrictStr] = Field(None, alias="refreshToken")
    username: Optional[StrictStr] = None
    display_name: Optional[StrictStr] = Field(None, alias="displayName")
    email: Optional[StrictStr] = None
    roles: Optional[conlist(Role)] = None
    email_verified: Optional[StrictBool] = Field(None, alias="emailVerified")
    locked_account: Optional[StrictBool] = Field(None, alias="lockedAccount")
    deleted_account: Optional[StrictBool] = Field(None, alias="deletedAccount")
    __properties = ["errored", "messages", "token", "refreshToken", "username", "displayName", "email", "roles", "emailVerified", "lockedAccount", "deletedAccount"]

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
    def from_json(cls, json_str: str) -> SignupResponse:
        """Create an instance of SignupResponse from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in roles (list)
        _items = []
        if self.roles:
            for _item in self.roles:
                if _item:
                    _items.append(_item.to_dict())
            _dict['roles'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> SignupResponse:
        """Create an instance of SignupResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return SignupResponse.parse_obj(obj)

        _obj = SignupResponse.parse_obj({
            "errored": obj.get("errored"),
            "messages": obj.get("messages"),
            "token": obj.get("token"),
            "refresh_token": obj.get("refreshToken"),
            "username": obj.get("username"),
            "display_name": obj.get("displayName"),
            "email": obj.get("email"),
            "roles": [Role.from_dict(_item) for _item in obj.get("roles")] if obj.get("roles") is not None else None,
            "email_verified": obj.get("emailVerified"),
            "locked_account": obj.get("lockedAccount"),
            "deleted_account": obj.get("deletedAccount")
        })
        return _obj


