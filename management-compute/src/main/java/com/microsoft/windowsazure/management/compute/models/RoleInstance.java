/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.compute.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import java.net.InetAddress;
import java.util.ArrayList;

/**
* Details of a specific role instance.
*/
public class RoleInstance {
    private GuestAgentStatus guestAgentStatus;
    
    /**
    * Optional. Guest Agent Status.
    * @return The GuestAgentStatus value.
    */
    public GuestAgentStatus getGuestAgentStatus() {
        return this.guestAgentStatus;
    }
    
    /**
    * Optional. Guest Agent Status.
    * @param guestAgentStatusValue The GuestAgentStatus value.
    */
    public void setGuestAgentStatus(final GuestAgentStatus guestAgentStatusValue) {
        this.guestAgentStatus = guestAgentStatusValue;
    }
    
    private String hostName;
    
    /**
    * Optional. The DNS host name of the service in which the role instance is
    * running. This element is only listed for Virtual Machine deployments.
    * @return The HostName value.
    */
    public String getHostName() {
        return this.hostName;
    }
    
    /**
    * Optional. The DNS host name of the service in which the role instance is
    * running. This element is only listed for Virtual Machine deployments.
    * @param hostNameValue The HostName value.
    */
    public void setHostName(final String hostNameValue) {
        this.hostName = hostNameValue;
    }
    
    private ArrayList<InstanceEndpoint> instanceEndpoints;
    
    /**
    * Optional. The list of instance endpoints for the role.
    * @return The InstanceEndpoints value.
    */
    public ArrayList<InstanceEndpoint> getInstanceEndpoints() {
        return this.instanceEndpoints;
    }
    
    /**
    * Optional. The list of instance endpoints for the role.
    * @param instanceEndpointsValue The InstanceEndpoints value.
    */
    public void setInstanceEndpoints(final ArrayList<InstanceEndpoint> instanceEndpointsValue) {
        this.instanceEndpoints = instanceEndpointsValue;
    }
    
    private String instanceErrorCode;
    
    /**
    * Optional. An error code that can be provided to Windows Azure support to
    * assist in resolution of errors. This field will typically be empty.
    * @return The InstanceErrorCode value.
    */
    public String getInstanceErrorCode() {
        return this.instanceErrorCode;
    }
    
    /**
    * Optional. An error code that can be provided to Windows Azure support to
    * assist in resolution of errors. This field will typically be empty.
    * @param instanceErrorCodeValue The InstanceErrorCode value.
    */
    public void setInstanceErrorCode(final String instanceErrorCodeValue) {
        this.instanceErrorCode = instanceErrorCodeValue;
    }
    
    private Integer instanceFaultDomain;
    
    /**
    * Optional. The fault domain that this role instance belongs to. Role
    * instances that are part of the same fault domain may all be vulnerable
    * to the failure of the same piece of shared hardware.
    * @return The InstanceFaultDomain value.
    */
    public Integer getInstanceFaultDomain() {
        return this.instanceFaultDomain;
    }
    
    /**
    * Optional. The fault domain that this role instance belongs to. Role
    * instances that are part of the same fault domain may all be vulnerable
    * to the failure of the same piece of shared hardware.
    * @param instanceFaultDomainValue The InstanceFaultDomain value.
    */
    public void setInstanceFaultDomain(final Integer instanceFaultDomainValue) {
        this.instanceFaultDomain = instanceFaultDomainValue;
    }
    
    private String instanceName;
    
    /**
    * Optional. The name of the specific role instance, if an instance of the
    * role is running.
    * @return The InstanceName value.
    */
    public String getInstanceName() {
        return this.instanceName;
    }
    
    /**
    * Optional. The name of the specific role instance, if an instance of the
    * role is running.
    * @param instanceNameValue The InstanceName value.
    */
    public void setInstanceName(final String instanceNameValue) {
        this.instanceName = instanceNameValue;
    }
    
    private String instanceSize;
    
    /**
    * Optional. The size of the role instance.
    * @return The InstanceSize value.
    */
    public String getInstanceSize() {
        return this.instanceSize;
    }
    
    /**
    * Optional. The size of the role instance.
    * @param instanceSizeValue The InstanceSize value.
    */
    public void setInstanceSize(final String instanceSizeValue) {
        this.instanceSize = instanceSizeValue;
    }
    
    private String instanceStateDetails;
    
    /**
    * Optional. The instance state, returned as a string that, when present,
    * provides a snapshot of the state of the virtual machine at the time the
    * operation was called.
    * @return The InstanceStateDetails value.
    */
    public String getInstanceStateDetails() {
        return this.instanceStateDetails;
    }
    
    /**
    * Optional. The instance state, returned as a string that, when present,
    * provides a snapshot of the state of the virtual machine at the time the
    * operation was called.
    * @param instanceStateDetailsValue The InstanceStateDetails value.
    */
    public void setInstanceStateDetails(final String instanceStateDetailsValue) {
        this.instanceStateDetails = instanceStateDetailsValue;
    }
    
    private String instanceStatus;
    
    /**
    * Optional. The current status of this instance.
    * @return The InstanceStatus value.
    */
    public String getInstanceStatus() {
        return this.instanceStatus;
    }
    
    /**
    * Optional. The current status of this instance.
    * @param instanceStatusValue The InstanceStatus value.
    */
    public void setInstanceStatus(final String instanceStatusValue) {
        this.instanceStatus = instanceStatusValue;
    }
    
    private Integer instanceUpgradeDomain;
    
    /**
    * Optional. The update domain that this role instance belongs to. During an
    * Upgrade Deployment, all roles in the same update domain are updated at
    * the same time.
    * @return The InstanceUpgradeDomain value.
    */
    public Integer getInstanceUpgradeDomain() {
        return this.instanceUpgradeDomain;
    }
    
    /**
    * Optional. The update domain that this role instance belongs to. During an
    * Upgrade Deployment, all roles in the same update domain are updated at
    * the same time.
    * @param instanceUpgradeDomainValue The InstanceUpgradeDomain value.
    */
    public void setInstanceUpgradeDomain(final Integer instanceUpgradeDomainValue) {
        this.instanceUpgradeDomain = instanceUpgradeDomainValue;
    }
    
    private InetAddress iPAddress;
    
    /**
    * Optional. The IP address of the role instance (DIP).
    * @return The IPAddress value.
    */
    public InetAddress getIPAddress() {
        return this.iPAddress;
    }
    
    /**
    * Optional. The IP address of the role instance (DIP).
    * @param iPAddressValue The IPAddress value.
    */
    public void setIPAddress(final InetAddress iPAddressValue) {
        this.iPAddress = iPAddressValue;
    }
    
    private RoleInstancePowerState powerState;
    
    /**
    * Optional. The running state of the role instance.
    * @return The PowerState value.
    */
    public RoleInstancePowerState getPowerState() {
        return this.powerState;
    }
    
    /**
    * Optional. The running state of the role instance.
    * @param powerStateValue The PowerState value.
    */
    public void setPowerState(final RoleInstancePowerState powerStateValue) {
        this.powerState = powerStateValue;
    }
    
    private ArrayList<RoleInstance.PublicIP> publicIPs;
    
    /**
    * Optional. Optional. A set of public IPs. Currently, only one additional
    * public IP per role is supported in an IaaS deployment. The IP address is
    * in addition to the default VIP for the deployment.
    * @return The PublicIPs value.
    */
    public ArrayList<RoleInstance.PublicIP> getPublicIPs() {
        return this.publicIPs;
    }
    
    /**
    * Optional. Optional. A set of public IPs. Currently, only one additional
    * public IP per role is supported in an IaaS deployment. The IP address is
    * in addition to the default VIP for the deployment.
    * @param publicIPsValue The PublicIPs value.
    */
    public void setPublicIPs(final ArrayList<RoleInstance.PublicIP> publicIPsValue) {
        this.publicIPs = publicIPsValue;
    }
    
    private String remoteAccessCertificateThumbprint;
    
    /**
    * Optional. The thumbprint of the RDP server certificate (in Windows) or
    * SSH server certificate (in Linux). The thumbprint is only used for
    * Virtual Machines that have been created from an image.
    * @return The RemoteAccessCertificateThumbprint value.
    */
    public String getRemoteAccessCertificateThumbprint() {
        return this.remoteAccessCertificateThumbprint;
    }
    
    /**
    * Optional. The thumbprint of the RDP server certificate (in Windows) or
    * SSH server certificate (in Linux). The thumbprint is only used for
    * Virtual Machines that have been created from an image.
    * @param remoteAccessCertificateThumbprintValue The
    * RemoteAccessCertificateThumbprint value.
    */
    public void setRemoteAccessCertificateThumbprint(final String remoteAccessCertificateThumbprintValue) {
        this.remoteAccessCertificateThumbprint = remoteAccessCertificateThumbprintValue;
    }
    
    private ArrayList<ResourceExtensionStatus> resourceExtensionStatusList;
    
    /**
    * Optional. Resource Extension Status List.
    * @return The ResourceExtensionStatusList value.
    */
    public ArrayList<ResourceExtensionStatus> getResourceExtensionStatusList() {
        return this.resourceExtensionStatusList;
    }
    
    /**
    * Optional. Resource Extension Status List.
    * @param resourceExtensionStatusListValue The ResourceExtensionStatusList
    * value.
    */
    public void setResourceExtensionStatusList(final ArrayList<ResourceExtensionStatus> resourceExtensionStatusListValue) {
        this.resourceExtensionStatusList = resourceExtensionStatusListValue;
    }
    
    private String roleName;
    
    /**
    * Optional. The name of the role.
    * @return The RoleName value.
    */
    public String getRoleName() {
        return this.roleName;
    }
    
    /**
    * Optional. The name of the role.
    * @param roleNameValue The RoleName value.
    */
    public void setRoleName(final String roleNameValue) {
        this.roleName = roleNameValue;
    }
    
    /**
    * Initializes a new instance of the RoleInstance class.
    *
    */
    public RoleInstance() {
        this.setInstanceEndpoints(new LazyArrayList<InstanceEndpoint>());
        this.setPublicIPs(new LazyArrayList<RoleInstance.PublicIP>());
        this.setResourceExtensionStatusList(new LazyArrayList<ResourceExtensionStatus>());
    }
    
    /**
    * An additional public IP that will be created for the role. The public IP
    * will be an additional IP for the role. The role continues to be
    * addressable via the default deployment VIP.
    */
    public static class PublicIP {
        private InetAddress address;
        
        /**
        * Optional. The address of the public IP.
        * @return The Address value.
        */
        public InetAddress getAddress() {
            return this.address;
        }
        
        /**
        * Optional. The address of the public IP.
        * @param addressValue The Address value.
        */
        public void setAddress(final InetAddress addressValue) {
            this.address = addressValue;
        }
        
        private Integer idleTimeoutInMinutes;
        
        /**
        * Optional. The idle timeout in minutes for this Public IP.
        * @return The IdleTimeoutInMinutes value.
        */
        public Integer getIdleTimeoutInMinutes() {
            return this.idleTimeoutInMinutes;
        }
        
        /**
        * Optional. The idle timeout in minutes for this Public IP.
        * @param idleTimeoutInMinutesValue The IdleTimeoutInMinutes value.
        */
        public void setIdleTimeoutInMinutes(final Integer idleTimeoutInMinutesValue) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutesValue;
        }
        
        private String name;
        
        /**
        * Optional. The name of the public IP.
        * @return The Name value.
        */
        public String getName() {
            return this.name;
        }
        
        /**
        * Optional. The name of the public IP.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }
    }
}
