/**
 * ItemTransStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package AllegroWebApi;

public class ItemTransStruct  implements java.io.Serializable {
    private java.lang.String[] bidWonList;

    private AllegroWebApi.MyContactList userContactList;

    public ItemTransStruct() {
    }

    public ItemTransStruct(
           java.lang.String[] bidWonList,
           AllegroWebApi.MyContactList userContactList) {
           this.bidWonList = bidWonList;
           this.userContactList = userContactList;
    }


    /**
     * Gets the bidWonList value for this ItemTransStruct.
     * 
     * @return bidWonList
     */
    public java.lang.String[] getBidWonList() {
        return bidWonList;
    }


    /**
     * Sets the bidWonList value for this ItemTransStruct.
     * 
     * @param bidWonList
     */
    public void setBidWonList(java.lang.String[] bidWonList) {
        this.bidWonList = bidWonList;
    }


    /**
     * Gets the userContactList value for this ItemTransStruct.
     * 
     * @return userContactList
     */
    public AllegroWebApi.MyContactList getUserContactList() {
        return userContactList;
    }


    /**
     * Sets the userContactList value for this ItemTransStruct.
     * 
     * @param userContactList
     */
    public void setUserContactList(AllegroWebApi.MyContactList userContactList) {
        this.userContactList = userContactList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemTransStruct)) return false;
        ItemTransStruct other = (ItemTransStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bidWonList==null && other.getBidWonList()==null) || 
             (this.bidWonList!=null &&
              java.util.Arrays.equals(this.bidWonList, other.getBidWonList()))) &&
            ((this.userContactList==null && other.getUserContactList()==null) || 
             (this.userContactList!=null &&
              this.userContactList.equals(other.getUserContactList())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBidWonList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBidWonList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBidWonList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserContactList() != null) {
            _hashCode += getUserContactList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemTransStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemTransStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidWonList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bid-won-list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userContactList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user-contact-list"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "MyContactList"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
