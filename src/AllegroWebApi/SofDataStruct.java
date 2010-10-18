/**
 * SofDataStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package AllegroWebApi;

public class SofDataStruct  implements java.io.Serializable {
    private long sofItemId;

    private int sofStatus;

    private long sofDate;

    private long sofBuyerId;

    private java.lang.String sofPaymentOption;

    private java.lang.String sofBankAccount;

    private java.lang.String sofTransportOption;

    private AllegroWebApi.UserSentToDataStruct userSentToData;

    private int sofInvoiceOption;

    private AllegroWebApi.InvoiceDataExtStruct invoiceDataExt;

    private java.lang.String sofBuyerToSellerMsg;

    public SofDataStruct() {
    }

    public SofDataStruct(
           long sofItemId,
           int sofStatus,
           long sofDate,
           long sofBuyerId,
           java.lang.String sofPaymentOption,
           java.lang.String sofBankAccount,
           java.lang.String sofTransportOption,
           AllegroWebApi.UserSentToDataStruct userSentToData,
           int sofInvoiceOption,
           AllegroWebApi.InvoiceDataExtStruct invoiceDataExt,
           java.lang.String sofBuyerToSellerMsg) {
           this.sofItemId = sofItemId;
           this.sofStatus = sofStatus;
           this.sofDate = sofDate;
           this.sofBuyerId = sofBuyerId;
           this.sofPaymentOption = sofPaymentOption;
           this.sofBankAccount = sofBankAccount;
           this.sofTransportOption = sofTransportOption;
           this.userSentToData = userSentToData;
           this.sofInvoiceOption = sofInvoiceOption;
           this.invoiceDataExt = invoiceDataExt;
           this.sofBuyerToSellerMsg = sofBuyerToSellerMsg;
    }


    /**
     * Gets the sofItemId value for this SofDataStruct.
     * 
     * @return sofItemId
     */
    public long getSofItemId() {
        return sofItemId;
    }


    /**
     * Sets the sofItemId value for this SofDataStruct.
     * 
     * @param sofItemId
     */
    public void setSofItemId(long sofItemId) {
        this.sofItemId = sofItemId;
    }


    /**
     * Gets the sofStatus value for this SofDataStruct.
     * 
     * @return sofStatus
     */
    public int getSofStatus() {
        return sofStatus;
    }


    /**
     * Sets the sofStatus value for this SofDataStruct.
     * 
     * @param sofStatus
     */
    public void setSofStatus(int sofStatus) {
        this.sofStatus = sofStatus;
    }


    /**
     * Gets the sofDate value for this SofDataStruct.
     * 
     * @return sofDate
     */
    public long getSofDate() {
        return sofDate;
    }


    /**
     * Sets the sofDate value for this SofDataStruct.
     * 
     * @param sofDate
     */
    public void setSofDate(long sofDate) {
        this.sofDate = sofDate;
    }


    /**
     * Gets the sofBuyerId value for this SofDataStruct.
     * 
     * @return sofBuyerId
     */
    public long getSofBuyerId() {
        return sofBuyerId;
    }


    /**
     * Sets the sofBuyerId value for this SofDataStruct.
     * 
     * @param sofBuyerId
     */
    public void setSofBuyerId(long sofBuyerId) {
        this.sofBuyerId = sofBuyerId;
    }


    /**
     * Gets the sofPaymentOption value for this SofDataStruct.
     * 
     * @return sofPaymentOption
     */
    public java.lang.String getSofPaymentOption() {
        return sofPaymentOption;
    }


    /**
     * Sets the sofPaymentOption value for this SofDataStruct.
     * 
     * @param sofPaymentOption
     */
    public void setSofPaymentOption(java.lang.String sofPaymentOption) {
        this.sofPaymentOption = sofPaymentOption;
    }


    /**
     * Gets the sofBankAccount value for this SofDataStruct.
     * 
     * @return sofBankAccount
     */
    public java.lang.String getSofBankAccount() {
        return sofBankAccount;
    }


    /**
     * Sets the sofBankAccount value for this SofDataStruct.
     * 
     * @param sofBankAccount
     */
    public void setSofBankAccount(java.lang.String sofBankAccount) {
        this.sofBankAccount = sofBankAccount;
    }


    /**
     * Gets the sofTransportOption value for this SofDataStruct.
     * 
     * @return sofTransportOption
     */
    public java.lang.String getSofTransportOption() {
        return sofTransportOption;
    }


    /**
     * Sets the sofTransportOption value for this SofDataStruct.
     * 
     * @param sofTransportOption
     */
    public void setSofTransportOption(java.lang.String sofTransportOption) {
        this.sofTransportOption = sofTransportOption;
    }


    /**
     * Gets the userSentToData value for this SofDataStruct.
     * 
     * @return userSentToData
     */
    public AllegroWebApi.UserSentToDataStruct getUserSentToData() {
        return userSentToData;
    }


    /**
     * Sets the userSentToData value for this SofDataStruct.
     * 
     * @param userSentToData
     */
    public void setUserSentToData(AllegroWebApi.UserSentToDataStruct userSentToData) {
        this.userSentToData = userSentToData;
    }


    /**
     * Gets the sofInvoiceOption value for this SofDataStruct.
     * 
     * @return sofInvoiceOption
     */
    public int getSofInvoiceOption() {
        return sofInvoiceOption;
    }


    /**
     * Sets the sofInvoiceOption value for this SofDataStruct.
     * 
     * @param sofInvoiceOption
     */
    public void setSofInvoiceOption(int sofInvoiceOption) {
        this.sofInvoiceOption = sofInvoiceOption;
    }


    /**
     * Gets the invoiceDataExt value for this SofDataStruct.
     * 
     * @return invoiceDataExt
     */
    public AllegroWebApi.InvoiceDataExtStruct getInvoiceDataExt() {
        return invoiceDataExt;
    }


    /**
     * Sets the invoiceDataExt value for this SofDataStruct.
     * 
     * @param invoiceDataExt
     */
    public void setInvoiceDataExt(AllegroWebApi.InvoiceDataExtStruct invoiceDataExt) {
        this.invoiceDataExt = invoiceDataExt;
    }


    /**
     * Gets the sofBuyerToSellerMsg value for this SofDataStruct.
     * 
     * @return sofBuyerToSellerMsg
     */
    public java.lang.String getSofBuyerToSellerMsg() {
        return sofBuyerToSellerMsg;
    }


    /**
     * Sets the sofBuyerToSellerMsg value for this SofDataStruct.
     * 
     * @param sofBuyerToSellerMsg
     */
    public void setSofBuyerToSellerMsg(java.lang.String sofBuyerToSellerMsg) {
        this.sofBuyerToSellerMsg = sofBuyerToSellerMsg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SofDataStruct)) return false;
        SofDataStruct other = (SofDataStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.sofItemId == other.getSofItemId() &&
            this.sofStatus == other.getSofStatus() &&
            this.sofDate == other.getSofDate() &&
            this.sofBuyerId == other.getSofBuyerId() &&
            ((this.sofPaymentOption==null && other.getSofPaymentOption()==null) || 
             (this.sofPaymentOption!=null &&
              this.sofPaymentOption.equals(other.getSofPaymentOption()))) &&
            ((this.sofBankAccount==null && other.getSofBankAccount()==null) || 
             (this.sofBankAccount!=null &&
              this.sofBankAccount.equals(other.getSofBankAccount()))) &&
            ((this.sofTransportOption==null && other.getSofTransportOption()==null) || 
             (this.sofTransportOption!=null &&
              this.sofTransportOption.equals(other.getSofTransportOption()))) &&
            ((this.userSentToData==null && other.getUserSentToData()==null) || 
             (this.userSentToData!=null &&
              this.userSentToData.equals(other.getUserSentToData()))) &&
            this.sofInvoiceOption == other.getSofInvoiceOption() &&
            ((this.invoiceDataExt==null && other.getInvoiceDataExt()==null) || 
             (this.invoiceDataExt!=null &&
              this.invoiceDataExt.equals(other.getInvoiceDataExt()))) &&
            ((this.sofBuyerToSellerMsg==null && other.getSofBuyerToSellerMsg()==null) || 
             (this.sofBuyerToSellerMsg!=null &&
              this.sofBuyerToSellerMsg.equals(other.getSofBuyerToSellerMsg())));
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
        _hashCode += new Long(getSofItemId()).hashCode();
        _hashCode += getSofStatus();
        _hashCode += new Long(getSofDate()).hashCode();
        _hashCode += new Long(getSofBuyerId()).hashCode();
        if (getSofPaymentOption() != null) {
            _hashCode += getSofPaymentOption().hashCode();
        }
        if (getSofBankAccount() != null) {
            _hashCode += getSofBankAccount().hashCode();
        }
        if (getSofTransportOption() != null) {
            _hashCode += getSofTransportOption().hashCode();
        }
        if (getUserSentToData() != null) {
            _hashCode += getUserSentToData().hashCode();
        }
        _hashCode += getSofInvoiceOption();
        if (getInvoiceDataExt() != null) {
            _hashCode += getInvoiceDataExt().hashCode();
        }
        if (getSofBuyerToSellerMsg() != null) {
            _hashCode += getSofBuyerToSellerMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SofDataStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SofDataStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sofItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sof-item-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sofStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sof-status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sofDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sof-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sofBuyerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sof-buyer-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sofPaymentOption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sof-payment-option"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sofBankAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sof-bank-account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sofTransportOption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sof-transport-option"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userSentToData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user-sent-to-data"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "UserSentToDataStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sofInvoiceOption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sof-invoice-option"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceDataExt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoice-data-ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "InvoiceDataExtStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sofBuyerToSellerMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sof-buyer-to-seller-msg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
