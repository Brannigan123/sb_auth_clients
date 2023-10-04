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
from pydantic import BaseModel, StrictStr, conlist

class Role(BaseModel):
    """
    Role
    """
    id: Optional[StrictStr] = None
    name: Optional[StrictStr] = None
    permissions: Optional[conlist(Permission)] = None
    authority: Optional[StrictStr] = None
    __properties = ["id", "name", "permissions", "authority"]

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
    def from_json(cls, json_str: str) -> Role:
        """Create an instance of Role from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in permissions (list)
        _items = []
        if self.permissions:
            for _item in self.permissions:
                if _item:
                    _items.append(_item.to_dict())
            _dict['permissions'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> Role:
        """Create an instance of Role from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return Role.parse_obj(obj)

        _obj = Role.parse_obj({
            "id": obj.get("id"),
            "name": obj.get("name"),
            "permissions": [Permission.from_dict(_item) for _item in obj.get("permissions")] if obj.get("permissions") is not None else None,
            "authority": obj.get("authority")
        })
        return _obj

from authclient.models.permission import Permission
Role.update_forward_refs()

