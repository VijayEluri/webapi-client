/**
 * PostBuyFormDataStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package AllegroWebApi;

public class PostBuyFormDataStruct  implements java.io.Serializable {
    private long postBuyFormId;

    private AllegroWebApi.PostBuyFormItemStruct[] postBuyFormItems;

    private long postBuyFormBuyerId;

    private float postBuyFormAmount;

    private float postBuyFormPostageAmount;

    private java.lang.String postBuyFormShipmentTitle;

    private int postBuyFormShipmentType;

    private int postBuyFormInvoiceOption;

    private java.lang.String postBuyFormMsgToSeller;

    private AllegroWebApi.PostBuyFormAddressStruct postBuyFormInvoiceData;

    private AllegroWebApi.PostBuyFormAddressStruct postBuyFormShipmentAddress;

    private java.lang.String postBuyFormPayType;

    private long postBuyFormPayId;

    private java.lang.String postBuyFormPayStatus;

    private java.lang.String postBuyFormDateInit;

    private java.lang.String postBuyFormDateRecv;

    private java.lang.String postBuyFormDateCancel;

    private int postBuyFormShipmentId;

    public PostBuyFormDataStruct() {
    }

    public PostBuyFormDataStruct(
           long postBuyFormId,
           AllegroWebApi.PostBuyFormItemStruct[] postBuyFormItems,
           long postBuyFormBuyerId,
           float postBuyFormAmount,
           float postBuyFormPostageAmount,
           java.lang.String postBuyFormShipmentTitle,
           int postBuyFormShipmentType,
           int postBuyFormInvoiceOption,
           java.lang.String postBuyFormMsgToSeller,
           AllegroWebApi.PostBuyFormAddressStruct postBuyFormInvoiceData,
           AllegroWebApi.PostBuyFormAddressStruct postBuyFormShipmentAddress,
           java.lang.String postBuyFormPayType,
           long postBuyFormPayId,
           java.lang.String postBuyFormPayStatus,
           java.lang.String postBuyFormDateInit,
           java.lang.String postBuyFormDateRecv,
           java.lang.String postBuyFormDateCancel,
           int postBuyFormShipmentId) {
           this.postBuyFormId = postBuyFormId;
           this.postBuyFormItems = postBuyFormItems;
           this.postBuyFormBuyerId = postBuyFormBuyerId;
           this.postBuyFormAmount = postBuyFormAmount;
           this.postBuyFormPostageAmount = postBuyFormPostageAmount;
           this.postBuyFormShipmentTitle = postBuyFormShipmentTitle;
           this.postBuyFormShipmentType = postBuyFormShipmentType;
           this.postBuyFormInvoiceOption = postBuyFormInvoiceOption;
           this.postBuyFormMsgToSeller = postBuyFormMsgToSeller;
           this.postBuyFormInvoiceData = postBuyFormInvoiceData;
           this.postBuyFormShipmentAddress = postBuyFormShipmentAddress;
           this.postBuyFormPayType = postBuyFormPayType;
           this.postBuyFormPayId = postBuyFormPayId;
           this.postBuyFormPayStatus = postBuyFormPayStatus;
           this.postBuyFormDateInit = postBuyFormDateInit;
           this.postBuyFormDateRecv = postBuyFormDateRecv;
           this.postBuyFormDateCancel = postBuyFormDateCancel;
           this.postBuyFormShipmentId = postBuyFormShipmentId;
    }


    /**
     * Gets the postBuyFormId value for this PostBuyFormDataStruct.
     * 
     * @return postBuyFormId
     */
    public long getPostBuyFormId() {
        return postBuyFormId;
    }


    /**
     * Sets the postBuyFormId value for this PostBuyFormDataStruct.
     * 
     * @param postBuyFormId
     */
    public void setPostBuyFormId(long postBuyFormId) {
        this.postBuyFormId = postBuyFormId;
    }


    /**
     * Gets the postBuyFormItems value for this PostBuyFormDataStruct.
     * 
     * @return postBuyFormItems
     */
    public AllegroWebApi.PostBuyFormItemStruct[] getPostBuyFormItems() {
        return postBuyFormItems;
    }


    /**
     * Sets the postBuyFormItems value for this PostBuyFormDataStruct.
     * 
     * @param postBuyFormItems
     */
    public void setPostBuyFormItems(AllegroWebApi.PostBuyFormItemStruct[] postBuyFormItems) {
        this.postBuyFormItems = postBuyFormItems;
    }


    /**
     * Gets the postBuyFormBuyerId value for this PostBuyFormDataStruct.
     * 
     * @return postBuyFormBuyerId
     */
    public long getPostBuyFormBuyerId() {
        return postBuyFormBuyerId;
    }


    /**
     * Sets the postBuyFormBuyerId value for this PostBuyFormDataStruct.
     * 
     * @param postBuyFormBuyerId
     */
    public void setPostBuyFormBuyerId(long postBuyFormBuyerId) {
        this.postBuyFormBuyerId = postBuyFormBuyerId;
    }


    /**
     * Gets the postBuyFormAmount value for this PostBuyFormDataStruct.
     * 
     * @return postBuyFormAmount
     */
    public float getPostBuyFormAmount() {
        return postBuyFormAmount;
    }


    /**
     * Sets the postBuyFormAmount value for this PostBuyFormDataStruct.
     * 
     * @param postBuyFormAmount
     */
    public void setPostBuyFormAmount(float postBuyFormAmount) {
        this.postBuyFormAmount = postBuyFormAmount;
    }


    /**
     * Gets the postBuyFormPostageAmount value for this PostBuyFormDataStruct.
     * 
     * @return postBuyFormPostageAmount
     */
    public float getPostBuyFormPostageAmount() {
        return postBuyFormPostageAmount;
    }


    /**
     * Sets the postBuyFormPostageAmount value for this PostBuyFormDataStruct.
     * 
     * @param postBuyFormPostageAmount
     */
    public void setPostBuyFormPostageAmount(float postBuyFormPostageAmount) {
        this.postBuyFormPostageAmount = postBuyFormPostageAmount;
    }


    /**
     * Gets the postBuyFormShipmentTitle value for this PostBuyFormDataStruct.
     * 
     * @return postBuyFormShipmentTitle
     */
    public java.lang.String getPostBuyFormShipmentTitle() {
        return postBuyFormShipmentTitle;
    }


    /**
     * Sets the postBuyFormShipmentTitle value for this PostBuyFormDataStruct.
     * 
     * @param postBuyFormShipmentTitle
     */
    public void setPostBuyFormShipmentTitle(java.lang.String postBuyFormShipmentTitle) {
        this.postBuyFormShipmentTitle = postBuyFormShipmentTitle;
    }


    /**
     * Gets the postBuyFormShipmentType value for this PostBuyFormDataStruct.
     * 
     * @return postBuyFormShipmentType
     */
    public int getPostBuyFormShipmentType() {
        return postBuyFormShipmentType;
    }


    /**
     * Sets the postBuyFormShipmentType value for this PostBuyFormDataStruct.
     * 
     * @param postBuyFormShipmentType
     */
    public void setPostBuyFormShipmentType(int postBuyFormShipmentType) {
        this.postBuyFormShipmentType = postBuyFormShipmentType;
    }


    /**
     * Gets the postBuyFormInvoiceOption value for this PostBuyFormDataStruct.
     * 
     * @return postBuyFormInvoiceOption
     */
    public int getPostBuyFormInvoiceOption() {
        return postBuyFormInvoiceOption;
    }


    /**
     * Sets the postBuyFormInvoiceOption value for this PostBuyFormDataStruct.
     * 
     * @param postBuyFormInvoiceOption
     */
    public void setPostBuyFormInvoiceOption(int postBuyFormInvoiceOption) {
        this.postBuyFormInvoiceOption = postBuyFormInvoiceOption;
    }


    /**
     * Gets the postBuyFormMsgToSeller value for this PostBuyFormDataStruct.
     * 
     * @return postBuyFormMsgToSeller
     */
    public java.lang.String getPostBuyFormMsgToSeller() {
        return postBuyFormMsgToSeller;
    }


    /**
     * Sets the postBuyFormMsgToSeller value for this PostBuyFormDataStruct.
     * 
     * @param postBuyFormMsgToSeller
     */
    public void setPostBuyFormMsgToSeller(java.lang.String postBuyFormMsgToSeller) {
        this.postBuyFormMsgToSeller = postBuyFormMsgToSeller;
    }


    /**
     * Gets the postBuyFormInvoiceData value for this PostBuyFormDataStruct.
     * 
     * @return postBuyFormInvoiceData
     */
    public AllegroWebApi.PostBuyFormAddressStruct getPostBuyFormInvoiceData() {
        return postBuyFormInvoiceData;
    }


    /**
     * Sets the postBuyFormInvoiceData value for this PostBuyFormDataStruct.
     * 
     * @param postBuyFormInvoiceData
     */
    public void setPostBuyFormInvoiceData(AllegroWebApi.PostBuyFormAddressStruct postBuyFormInvoiceData) {
        this.postBuyFormInvoiceData = postBuyFormInvoiceData;
    }


    /**
     * Gets the postBuyFormShipmentAddress value for this PostBuyFormDataStruct.
     * 
     * @return postBuyFormShipmentAddress
     */
    public AllegroWebApi.PostBuyFormAddressStruct getPostBuyFormShipmentAddress() {
        return postBuyFormShipmentAddress;
    }


    /**
     * Sets the postBuyFormShipmentAddress value for this PostBuyFormDataStruct.
     * 
     * @param postBuyFormShipmentAddress
     */
    public void setPostBuyFormShipmentAddress(AllegroWebApi.PostBuyFormAddressStruct postBuyFormShipmentAddress) {
        this.postBuyFormShipmentAddress = postBuyFormShipmentAddress;
    }


    /**
     * Gets the postBuyFormPayType value for this PostBuyFormDataStruct.
     * 
     * @return postBuyFormPayType
     */
    public java.lang.String getPostBuyFormPayType() {
        return postBuyFormPayType;
    }


    /**
     * Sets the postBuyFormPayType value for this PostBuyFormDataStruct.
     * 
     * @param postBuyFormPayType
     */
    public void setPostBuyFormPayType(java.lang.String postBuyFormPayType) {
        this.postBuyFormPayType = postBuyFormPayType;
    }


    /**
     * Gets the postBuyFormPayId value for this PostBuyFormDataStruct.
     * 
     * @return postBuyFormPayId
     */
    public long getPostBuyFormPayId() {
        return postBuyFormPayId;
    }


    /**
     * Sets the postBuyFormPayId value for this PostBuyFormDataStruct.
     * 
     * @param postBuyFormPayId
     */
    public void setPostBuyFormPayId(long postBuyFormPayId) {
        this.postBuyFormPayId = postBuyFormPayId;
    }


    /**
     * Gets the postBuyFormPayStatus value for this PostBuyFormDataStruct.
     * 
     * @return postBuyFormPayStatus
     */
    public java.lang.String getPostBuyFormPayStatus() {
        return postBuyFormPayStatus;
    }


    /**
     * Sets the postBuyFormPayStatus value for this PostBuyFormDataStruct.
     * 
     * @param postBuyFormPayStatus
     */
    public void setPostBuyFormPayStatus(java.lang.String postBuyFormPayStatus) {
        this.postBuyFormPayStatus = postBuyFormPayStatus;
    }


    /**
     * Gets the postBuyFormDateInit value for this PostBuyFormDataStruct.
     * 
     * @return postBuyFormDateInit
     */
    public java.lang.String getPostBuyFormDateInit() {
        return postBuyFormDateInit;
    }


    /**
     * Sets the postBuyFormDateInit value for this PostBuyFormDataStruct.
     * 
     * @param postBuyFormDateInit
     */
    public void setPostBuyFormDateInit(java.lang.String postBuyFormDateInit) {
        this.postBuyFormDateInit = postBuyFormDateInit;
    }


    /**
     * Gets the postBuyFormDateRecv value for this PostBuyFormDataStruct.
     * 
     * @return postBuyFormDateRecv
     */
    public java.lang.String getPostBuyFormDateRecv() {
        return postBuyFormDateRecv;
    }


    /**
     * Sets the postBuyFormDateRecv value for this PostBuyFormDataStruct.
     * 
     * @param postBuyFormDateRecv
     */
    public void setPostBuyFormDateRecv(java.lang.String postBuyFormDateRecv) {
        this.postBuyFormDateRecv = postBuyFormDateRecv;
    }


    /**
     * Gets the postBuyFormDateCancel value for this PostBuyFormDataStruct.
     * 
     * @return postBuyFormDateCancel
     */
    public java.lang.String getPostBuyFormDateCancel() {
        return postBuyFormDateCancel;
    }


    /**
     * Sets the postBuyFormDateCancel value for this PostBuyFormDataStruct.
     * 
     * @param postBuyFormDateCancel
     */
    public void setPostBuyFormDateCancel(java.lang.String postBuyFormDateCancel) {
        this.postBuyFormDateCancel = postBuyFormDateCancel;
    }


    /**
     * Gets the postBuyFormShipmentId value for this PostBuyFormDataStruct.
     * 
     * @return postBuyFormShipmentId
     */
    public int getPostBuyFormShipmentId() {
        return postBuyFormShipmentId;
    }


    /**
     * Sets the postBuyFormShipmentId value for this PostBuyFormDataStruct.
     * 
     * @param postBuyFormShipmentId
     */
    public void setPostBuyFormShipmentId(int postBuyFormShipmentId) {
        this.postBuyFormShipmentId = postBuyFormShipmentId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostBuyFormDataStruct)) return false;
        PostBuyFormDataStruct other = (PostBuyFormDataStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.postBuyFormId == other.getPostBuyFormId() &&
            ((this.postBuyFormItems==null && other.getPostBuyFormItems()==null) || 
             (this.postBuyFormItems!=null &&
              java.util.Arrays.equals(this.postBuyFormItems, other.getPostBuyFormItems()))) &&
            this.postBuyFormBuyerId == other.getPostBuyFormBuyerId() &&
            this.postBuyFormAmount == other.getPostBuyFormAmount() &&
            this.postBuyFormPostageAmount == other.getPostBuyFormPostageAmount() &&
            ((this.postBuyFormShipmentTitle==null && other.getPostBuyFormShipmentTitle()==null) || 
             (this.postBuyFormShipmentTitle!=null &&
              this.postBuyFormShipmentTitle.equals(other.getPostBuyFormShipmentTitle()))) &&
            this.postBuyFormShipmentType == other.getPostBuyFormShipmentType() &&
            this.postBuyFormInvoiceOption == other.getPostBuyFormInvoiceOption() &&
            ((this.postBuyFormMsgToSeller==null && other.getPostBuyFormMsgToSeller()==null) || 
             (this.postBuyFormMsgToSeller!=null &&
              this.postBuyFormMsgToSeller.equals(other.getPostBuyFormMsgToSeller()))) &&
            ((this.postBuyFormInvoiceData==null && other.getPostBuyFormInvoiceData()==null) || 
             (this.postBuyFormInvoiceData!=null &&
              this.postBuyFormInvoiceData.equals(other.getPostBuyFormInvoiceData()))) &&
            ((this.postBuyFormShipmentAddress==null && other.getPostBuyFormShipmentAddress()==null) || 
             (this.postBuyFormShipmentAddress!=null &&
              this.postBuyFormShipmentAddress.equals(other.getPostBuyFormShipmentAddress()))) &&
            ((this.postBuyFormPayType==null && other.getPostBuyFormPayType()==null) || 
             (this.postBuyFormPayType!=null &&
              this.postBuyFormPayType.equals(other.getPostBuyFormPayType()))) &&
            this.postBuyFormPayId == other.getPostBuyFormPayId() &&
            ((this.postBuyFormPayStatus==null && other.getPostBuyFormPayStatus()==null) || 
             (this.postBuyFormPayStatus!=null &&
              this.postBuyFormPayStatus.equals(other.getPostBuyFormPayStatus()))) &&
            ((this.postBuyFormDateInit==null && other.getPostBuyFormDateInit()==null) || 
             (this.postBuyFormDateInit!=null &&
              this.postBuyFormDateInit.equals(other.getPostBuyFormDateInit()))) &&
            ((this.postBuyFormDateRecv==null && other.getPostBuyFormDateRecv()==null) || 
             (this.postBuyFormDateRecv!=null &&
              this.postBuyFormDateRecv.equals(other.getPostBuyFormDateRecv()))) &&
            ((this.postBuyFormDateCancel==null && other.getPostBuyFormDateCancel()==null) || 
             (this.postBuyFormDateCancel!=null &&
              this.postBuyFormDateCancel.equals(other.getPostBuyFormDateCancel()))) &&
            this.postBuyFormShipmentId == other.getPostBuyFormShipmentId();
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
        _hashCode += new Long(getPostBuyFormId()).hashCode();
        if (getPostBuyFormItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPostBuyFormItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPostBuyFormItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getPostBuyFormBuyerId()).hashCode();
        _hashCode += new Float(getPostBuyFormAmount()).hashCode();
        _hashCode += new Float(getPostBuyFormPostageAmount()).hashCode();
        if (getPostBuyFormShipmentTitle() != null) {
            _hashCode += getPostBuyFormShipmentTitle().hashCode();
        }
        _hashCode += getPostBuyFormShipmentType();
        _hashCode += getPostBuyFormInvoiceOption();
        if (getPostBuyFormMsgToSeller() != null) {
            _hashCode += getPostBuyFormMsgToSeller().hashCode();
        }
        if (getPostBuyFormInvoiceData() != null) {
            _hashCode += getPostBuyFormInvoiceData().hashCode();
        }
        if (getPostBuyFormShipmentAddress() != null) {
            _hashCode += getPostBuyFormShipmentAddress().hashCode();
        }
        if (getPostBuyFormPayType() != null) {
            _hashCode += getPostBuyFormPayType().hashCode();
        }
        _hashCode += new Long(getPostBuyFormPayId()).hashCode();
        if (getPostBuyFormPayStatus() != null) {
            _hashCode += getPostBuyFormPayStatus().hashCode();
        }
        if (getPostBuyFormDateInit() != null) {
            _hashCode += getPostBuyFormDateInit().hashCode();
        }
        if (getPostBuyFormDateRecv() != null) {
            _hashCode += getPostBuyFormDateRecv().hashCode();
        }
        if (getPostBuyFormDateCancel() != null) {
            _hashCode += getPostBuyFormDateCancel().hashCode();
        }
        _hashCode += getPostBuyFormShipmentId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PostBuyFormDataStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormDataStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post-buy-form-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post-buy-form-items"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormItemStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormBuyerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post-buy-form-buyer-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post-buy-form-amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormPostageAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post-buy-form-postage-amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormShipmentTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post-buy-form-shipment-title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormShipmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post-buy-form-shipment-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormInvoiceOption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post-buy-form-invoice-option"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormMsgToSeller");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post-buy-form-msg-to-seller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormInvoiceData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post-buy-form-invoice-data"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormAddressStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormShipmentAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post-buy-form-shipment-address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormAddressStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormPayType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post-buy-form-pay-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormPayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post-buy-form-pay-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormPayStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post-buy-form-pay-status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormDateInit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post-buy-form-date-init"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormDateRecv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post-buy-form-date-recv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormDateCancel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post-buy-form-date-cancel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormShipmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post-buy-form-shipment-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
