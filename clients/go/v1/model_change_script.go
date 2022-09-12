/*
 * Nomad
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.1.4
 * Contact: support@hashicorp.com
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// ChangeScript struct for ChangeScript
type ChangeScript struct {
	Args *[]string `json:"Args,omitempty"`
	Command *string `json:"Command,omitempty"`
	FailOnError *bool `json:"FailOnError,omitempty"`
	Timeout *int64 `json:"Timeout,omitempty"`
}

// NewChangeScript instantiates a new ChangeScript object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewChangeScript() *ChangeScript {
	this := ChangeScript{}
	return &this
}

// NewChangeScriptWithDefaults instantiates a new ChangeScript object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewChangeScriptWithDefaults() *ChangeScript {
	this := ChangeScript{}
	return &this
}

// GetArgs returns the Args field value if set, zero value otherwise.
func (o *ChangeScript) GetArgs() []string {
	if o == nil || o.Args == nil {
		var ret []string
		return ret
	}
	return *o.Args
}

// GetArgsOk returns a tuple with the Args field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ChangeScript) GetArgsOk() (*[]string, bool) {
	if o == nil || o.Args == nil {
		return nil, false
	}
	return o.Args, true
}

// HasArgs returns a boolean if a field has been set.
func (o *ChangeScript) HasArgs() bool {
	if o != nil && o.Args != nil {
		return true
	}

	return false
}

// SetArgs gets a reference to the given []string and assigns it to the Args field.
func (o *ChangeScript) SetArgs(v []string) {
	o.Args = &v
}

// GetCommand returns the Command field value if set, zero value otherwise.
func (o *ChangeScript) GetCommand() string {
	if o == nil || o.Command == nil {
		var ret string
		return ret
	}
	return *o.Command
}

// GetCommandOk returns a tuple with the Command field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ChangeScript) GetCommandOk() (*string, bool) {
	if o == nil || o.Command == nil {
		return nil, false
	}
	return o.Command, true
}

// HasCommand returns a boolean if a field has been set.
func (o *ChangeScript) HasCommand() bool {
	if o != nil && o.Command != nil {
		return true
	}

	return false
}

// SetCommand gets a reference to the given string and assigns it to the Command field.
func (o *ChangeScript) SetCommand(v string) {
	o.Command = &v
}

// GetFailOnError returns the FailOnError field value if set, zero value otherwise.
func (o *ChangeScript) GetFailOnError() bool {
	if o == nil || o.FailOnError == nil {
		var ret bool
		return ret
	}
	return *o.FailOnError
}

// GetFailOnErrorOk returns a tuple with the FailOnError field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ChangeScript) GetFailOnErrorOk() (*bool, bool) {
	if o == nil || o.FailOnError == nil {
		return nil, false
	}
	return o.FailOnError, true
}

// HasFailOnError returns a boolean if a field has been set.
func (o *ChangeScript) HasFailOnError() bool {
	if o != nil && o.FailOnError != nil {
		return true
	}

	return false
}

// SetFailOnError gets a reference to the given bool and assigns it to the FailOnError field.
func (o *ChangeScript) SetFailOnError(v bool) {
	o.FailOnError = &v
}

// GetTimeout returns the Timeout field value if set, zero value otherwise.
func (o *ChangeScript) GetTimeout() int64 {
	if o == nil || o.Timeout == nil {
		var ret int64
		return ret
	}
	return *o.Timeout
}

// GetTimeoutOk returns a tuple with the Timeout field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ChangeScript) GetTimeoutOk() (*int64, bool) {
	if o == nil || o.Timeout == nil {
		return nil, false
	}
	return o.Timeout, true
}

// HasTimeout returns a boolean if a field has been set.
func (o *ChangeScript) HasTimeout() bool {
	if o != nil && o.Timeout != nil {
		return true
	}

	return false
}

// SetTimeout gets a reference to the given int64 and assigns it to the Timeout field.
func (o *ChangeScript) SetTimeout(v int64) {
	o.Timeout = &v
}

func (o ChangeScript) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Args != nil {
		toSerialize["Args"] = o.Args
	}
	if o.Command != nil {
		toSerialize["Command"] = o.Command
	}
	if o.FailOnError != nil {
		toSerialize["FailOnError"] = o.FailOnError
	}
	if o.Timeout != nil {
		toSerialize["Timeout"] = o.Timeout
	}
	return json.Marshal(toSerialize)
}

type NullableChangeScript struct {
	value *ChangeScript
	isSet bool
}

func (v NullableChangeScript) Get() *ChangeScript {
	return v.value
}

func (v *NullableChangeScript) Set(val *ChangeScript) {
	v.value = val
	v.isSet = true
}

func (v NullableChangeScript) IsSet() bool {
	return v.isSet
}

func (v *NullableChangeScript) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableChangeScript(val *ChangeScript) *NullableChangeScript {
	return &NullableChangeScript{value: val, isSet: true}
}

func (v NullableChangeScript) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableChangeScript) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


