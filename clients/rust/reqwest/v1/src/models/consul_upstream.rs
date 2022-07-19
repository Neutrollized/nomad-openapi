/*
 * Nomad
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.1.4
 * Contact: support@hashicorp.com
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct ConsulUpstream {
    #[serde(rename = "Datacenter", skip_serializing_if = "Option::is_none")]
    pub datacenter: Option<String>,
    #[serde(rename = "DestinationName", skip_serializing_if = "Option::is_none")]
    pub destination_name: Option<String>,
    #[serde(rename = "DestinationNamespace", skip_serializing_if = "Option::is_none")]
    pub destination_namespace: Option<String>,
    #[serde(rename = "LocalBindAddress", skip_serializing_if = "Option::is_none")]
    pub local_bind_address: Option<String>,
    #[serde(rename = "LocalBindPort", skip_serializing_if = "Option::is_none")]
    pub local_bind_port: Option<i32>,
    #[serde(rename = "MeshGateway", skip_serializing_if = "Option::is_none")]
    pub mesh_gateway: Option<Box<crate::models::ConsulMeshGateway>>,
}

impl ConsulUpstream {
    pub fn new() -> ConsulUpstream {
        ConsulUpstream {
            datacenter: None,
            destination_name: None,
            destination_namespace: None,
            local_bind_address: None,
            local_bind_port: None,
            mesh_gateway: None,
        }
    }
}


