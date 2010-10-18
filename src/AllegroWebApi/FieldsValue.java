/**
 * FieldsValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package AllegroWebApi;

public class FieldsValue  implements java.io.Serializable {
    private int fid;

    private java.lang.String fvalueString;

    private int fvalueInt;

    private float fvalueFloat;

    private byte[] fvalueImage;

    private float fvalueDatetime;

    private boolean fvalueBoolean;

    public FieldsValue() {
    }

    public FieldsValue(
           int fid,
           java.lang.String fvalueString,
           int fvalueInt,
           float fvalueFloat,
           byte[] fvalueImage,
           float fvalueDatetime,
           boolean fvalueBoolean) {
           this.fid = fid;
           this.fvalueString = fvalueString;
           this.fvalueInt = fvalueInt;
           this.fvalueFloat = fvalueFloat;
           this.fvalueImage = fvalueImage;
           this.fvalueDatetime = fvalueDatetime;
           this.fvalueBoolean = fvalueBoolean;
    }


    /**
     * Gets the fid value for this FieldsValue.
     * 
     * @return fid
     */
    public int getFid() {
        return fid;
    }


    /**
     * Sets the fid value for this FieldsValue.
     * 
     * @param fid
     */
    public void setFid(int fid) {
        this.fid = fid;
    }


    /**
     * Gets the fvalueString value for this FieldsValue.
     * 
     * @return fvalueString
     */
    public java.lang.String getFvalueString() {
        return fvalueString;
    }


    /**
     * Sets the fvalueString value for this FieldsValue.
     * 
     * @param fvalueString
     */
    public void setFvalueString(java.lang.String fvalueString) {
        this.fvalueString = fvalueString;
    }


    /**
     * Gets the fvalueInt value for this FieldsValue.
     * 
     * @return fvalueInt
     */
    public int getFvalueInt() {
        return fvalueInt;
    }


    /**
     * Sets the fvalueInt value for this FieldsValue.
     * 
     * @param fvalueInt
     */
    public void setFvalueInt(int fvalueInt) {
        this.fvalueInt = fvalueInt;
    }


    /**
     * Gets the fvalueFloat value for this FieldsValue.
     * 
     * @return fvalueFloat
     */
    public float getFvalueFloat() {
        return fvalueFloat;
    }


    /**
     * Sets the fvalueFloat value for this FieldsValue.
     * 
     * @param fvalueFloat
     */
    public void setFvalueFloat(float fvalueFloat) {
        this.fvalueFloat = fvalueFloat;
    }


    /**
     * Gets the fvalueImage value for this FieldsValue.
     * 
     * @return fvalueImage
     */
    public byte[] getFvalueImage() {
        return fvalueImage;
    }


    /**
     * Sets the fvalueImage value for this FieldsValue.
     * 
     * @param fvalueImage
     */
    public void setFvalueImage(byte[] fvalueImage) {
        this.fvalueImage = fvalueImage;
    }


    /**
     * Gets the fvalueDatetime value for this FieldsValue.
     * 
     * @return fvalueDatetime
     */
    public float getFvalueDatetime() {
        return fvalueDatetime;
    }


    /**
     * Sets the fvalueDatetime value for this FieldsValue.
     * 
     * @param fvalueDatetime
     */
    public void setFvalueDatetime(float fvalueDatetime) {
        this.fvalueDatetime = fvalueDatetime;
    }


    /**
     * Gets the fvalueBoolean value for this FieldsValue.
     * 
     * @return fvalueBoolean
     */
    public boolean isFvalueBoolean() {
        return fvalueBoolean;
    }


    /**
     * Sets the fvalueBoolean value for this FieldsValue.
     * 
     * @param fvalueBoolean
     */
    public void setFvalueBoolean(boolean fvalueBoolean) {
        this.fvalueBoolean = fvalueBoolean;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FieldsValue)) return false;
        FieldsValue other = (FieldsValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.fid == other.getFid() &&
            ((this.fvalueString==null && other.getFvalueString()==null) || 
             (this.fvalueString!=null &&
              this.fvalueString.equals(other.getFvalueString()))) &&
            this.fvalueInt == other.getFvalueInt() &&
            this.fvalueFloat == other.getFvalueFloat() &&
            ((this.fvalueImage==null && other.getFvalueImage()==null) || 
             (this.fvalueImage!=null &&
              java.util.Arrays.equals(this.fvalueImage, other.getFvalueImage()))) &&
            this.fvalueDatetime == other.getFvalueDatetime() &&
            this.fvalueBoolean == other.isFvalueBoolean();
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
        _hashCode += getFid();
        if (getFvalueString() != null) {
            _hashCode += getFvalueString().hashCode();
        }
        _hashCode += getFvalueInt();
        _hashCode += new Float(getFvalueFloat()).hashCode();
        if (getFvalueImage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFvalueImage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFvalueImage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Float(getFvalueDatetime()).hashCode();
        _hashCode += (isFvalueBoolean() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FieldsValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "FieldsValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fvalueString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fvalue-string"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fvalueInt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fvalue-int"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fvalueFloat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fvalue-float"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fvalueImage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fvalue-image"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fvalueDatetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fvalue-datetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fvalueBoolean");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fvalue-boolean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
