# Copyright (c) HashiCorp, Inc.
# SPDX-License-Identifier: MPL-2.0

=begin
#Nomad

#No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

The version of the OpenAPI document: 1.1.4
Contact: support@hashicorp.com
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.2.0

=end

require 'date'
require 'time'

module NomadClient
  class AllocationMetric
    attr_accessor :allocation_time

    attr_accessor :class_exhausted

    attr_accessor :class_filtered

    attr_accessor :coalesced_failures

    attr_accessor :constraint_filtered

    attr_accessor :dimension_exhausted

    attr_accessor :nodes_available

    attr_accessor :nodes_evaluated

    attr_accessor :nodes_exhausted

    attr_accessor :nodes_filtered

    attr_accessor :quota_exhausted

    attr_accessor :resources_exhausted

    attr_accessor :score_meta_data

    attr_accessor :scores

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'allocation_time' => :'AllocationTime',
        :'class_exhausted' => :'ClassExhausted',
        :'class_filtered' => :'ClassFiltered',
        :'coalesced_failures' => :'CoalescedFailures',
        :'constraint_filtered' => :'ConstraintFiltered',
        :'dimension_exhausted' => :'DimensionExhausted',
        :'nodes_available' => :'NodesAvailable',
        :'nodes_evaluated' => :'NodesEvaluated',
        :'nodes_exhausted' => :'NodesExhausted',
        :'nodes_filtered' => :'NodesFiltered',
        :'quota_exhausted' => :'QuotaExhausted',
        :'resources_exhausted' => :'ResourcesExhausted',
        :'score_meta_data' => :'ScoreMetaData',
        :'scores' => :'Scores'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'allocation_time' => :'Integer',
        :'class_exhausted' => :'Hash<String, Integer>',
        :'class_filtered' => :'Hash<String, Integer>',
        :'coalesced_failures' => :'Integer',
        :'constraint_filtered' => :'Hash<String, Integer>',
        :'dimension_exhausted' => :'Hash<String, Integer>',
        :'nodes_available' => :'Hash<String, Integer>',
        :'nodes_evaluated' => :'Integer',
        :'nodes_exhausted' => :'Integer',
        :'nodes_filtered' => :'Integer',
        :'quota_exhausted' => :'Array<String>',
        :'resources_exhausted' => :'Hash<String, Resources>',
        :'score_meta_data' => :'Array<NodeScoreMeta>',
        :'scores' => :'Hash<String, Float>'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
      ])
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `NomadClient::AllocationMetric` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `NomadClient::AllocationMetric`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'allocation_time')
        self.allocation_time = attributes[:'allocation_time']
      end

      if attributes.key?(:'class_exhausted')
        if (value = attributes[:'class_exhausted']).is_a?(Hash)
          self.class_exhausted = value
        end
      end

      if attributes.key?(:'class_filtered')
        if (value = attributes[:'class_filtered']).is_a?(Hash)
          self.class_filtered = value
        end
      end

      if attributes.key?(:'coalesced_failures')
        self.coalesced_failures = attributes[:'coalesced_failures']
      end

      if attributes.key?(:'constraint_filtered')
        if (value = attributes[:'constraint_filtered']).is_a?(Hash)
          self.constraint_filtered = value
        end
      end

      if attributes.key?(:'dimension_exhausted')
        if (value = attributes[:'dimension_exhausted']).is_a?(Hash)
          self.dimension_exhausted = value
        end
      end

      if attributes.key?(:'nodes_available')
        if (value = attributes[:'nodes_available']).is_a?(Hash)
          self.nodes_available = value
        end
      end

      if attributes.key?(:'nodes_evaluated')
        self.nodes_evaluated = attributes[:'nodes_evaluated']
      end

      if attributes.key?(:'nodes_exhausted')
        self.nodes_exhausted = attributes[:'nodes_exhausted']
      end

      if attributes.key?(:'nodes_filtered')
        self.nodes_filtered = attributes[:'nodes_filtered']
      end

      if attributes.key?(:'quota_exhausted')
        if (value = attributes[:'quota_exhausted']).is_a?(Array)
          self.quota_exhausted = value
        end
      end

      if attributes.key?(:'resources_exhausted')
        if (value = attributes[:'resources_exhausted']).is_a?(Hash)
          self.resources_exhausted = value
        end
      end

      if attributes.key?(:'score_meta_data')
        if (value = attributes[:'score_meta_data']).is_a?(Array)
          self.score_meta_data = value
        end
      end

      if attributes.key?(:'scores')
        if (value = attributes[:'scores']).is_a?(Hash)
          self.scores = value
        end
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          allocation_time == o.allocation_time &&
          class_exhausted == o.class_exhausted &&
          class_filtered == o.class_filtered &&
          coalesced_failures == o.coalesced_failures &&
          constraint_filtered == o.constraint_filtered &&
          dimension_exhausted == o.dimension_exhausted &&
          nodes_available == o.nodes_available &&
          nodes_evaluated == o.nodes_evaluated &&
          nodes_exhausted == o.nodes_exhausted &&
          nodes_filtered == o.nodes_filtered &&
          quota_exhausted == o.quota_exhausted &&
          resources_exhausted == o.resources_exhausted &&
          score_meta_data == o.score_meta_data &&
          scores == o.scores
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [allocation_time, class_exhausted, class_filtered, coalesced_failures, constraint_filtered, dimension_exhausted, nodes_available, nodes_evaluated, nodes_exhausted, nodes_filtered, quota_exhausted, resources_exhausted, score_meta_data, scores].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.openapi_types.each_pair do |key, type|
        if attributes[self.class.attribute_map[key]].nil? && self.class.openapi_nullable.include?(key)
          self.send("#{key}=", nil)
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :Time
        Time.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = NomadClient.const_get(type)
        klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.include?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end
