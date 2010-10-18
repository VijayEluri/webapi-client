/**
 * SiteJournalFeedbacks.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package AllegroWebApi;

public class SiteJournalFeedbacks  implements java.io.Serializable {
    private long feedbackRowId;

    private java.lang.String feedbackChangeType;

    private long feedbackChangeDate;

    private int feedbackFrom;

    private int feedbackTo;

    private int feedbackId;

    public SiteJournalFeedbacks() {
    }

    public SiteJournalFeedbacks(
           long feedbackRowId,
           java.lang.String feedbackChangeType,
           long feedbackChangeDate,
           int feedbackFrom,
           int feedbackTo,
           int feedbackId) {
           this.feedbackRowId = feedbackRowId;
           this.feedbackChangeType = feedbackChangeType;
           this.feedbackChangeDate = feedbackChangeDate;
           this.feedbackFrom = feedbackFrom;
           this.feedbackTo = feedbackTo;
           this.feedbackId = feedbackId;
    }


    /**
     * Gets the feedbackRowId value for this SiteJournalFeedbacks.
     * 
     * @return feedbackRowId
     */
    public long getFeedbackRowId() {
        return feedbackRowId;
    }


    /**
     * Sets the feedbackRowId value for this SiteJournalFeedbacks.
     * 
     * @param feedbackRowId
     */
    public void setFeedbackRowId(long feedbackRowId) {
        this.feedbackRowId = feedbackRowId;
    }


    /**
     * Gets the feedbackChangeType value for this SiteJournalFeedbacks.
     * 
     * @return feedbackChangeType
     */
    public java.lang.String getFeedbackChangeType() {
        return feedbackChangeType;
    }


    /**
     * Sets the feedbackChangeType value for this SiteJournalFeedbacks.
     * 
     * @param feedbackChangeType
     */
    public void setFeedbackChangeType(java.lang.String feedbackChangeType) {
        this.feedbackChangeType = feedbackChangeType;
    }


    /**
     * Gets the feedbackChangeDate value for this SiteJournalFeedbacks.
     * 
     * @return feedbackChangeDate
     */
    public long getFeedbackChangeDate() {
        return feedbackChangeDate;
    }


    /**
     * Sets the feedbackChangeDate value for this SiteJournalFeedbacks.
     * 
     * @param feedbackChangeDate
     */
    public void setFeedbackChangeDate(long feedbackChangeDate) {
        this.feedbackChangeDate = feedbackChangeDate;
    }


    /**
     * Gets the feedbackFrom value for this SiteJournalFeedbacks.
     * 
     * @return feedbackFrom
     */
    public int getFeedbackFrom() {
        return feedbackFrom;
    }


    /**
     * Sets the feedbackFrom value for this SiteJournalFeedbacks.
     * 
     * @param feedbackFrom
     */
    public void setFeedbackFrom(int feedbackFrom) {
        this.feedbackFrom = feedbackFrom;
    }


    /**
     * Gets the feedbackTo value for this SiteJournalFeedbacks.
     * 
     * @return feedbackTo
     */
    public int getFeedbackTo() {
        return feedbackTo;
    }


    /**
     * Sets the feedbackTo value for this SiteJournalFeedbacks.
     * 
     * @param feedbackTo
     */
    public void setFeedbackTo(int feedbackTo) {
        this.feedbackTo = feedbackTo;
    }


    /**
     * Gets the feedbackId value for this SiteJournalFeedbacks.
     * 
     * @return feedbackId
     */
    public int getFeedbackId() {
        return feedbackId;
    }


    /**
     * Sets the feedbackId value for this SiteJournalFeedbacks.
     * 
     * @param feedbackId
     */
    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SiteJournalFeedbacks)) return false;
        SiteJournalFeedbacks other = (SiteJournalFeedbacks) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.feedbackRowId == other.getFeedbackRowId() &&
            ((this.feedbackChangeType==null && other.getFeedbackChangeType()==null) || 
             (this.feedbackChangeType!=null &&
              this.feedbackChangeType.equals(other.getFeedbackChangeType()))) &&
            this.feedbackChangeDate == other.getFeedbackChangeDate() &&
            this.feedbackFrom == other.getFeedbackFrom() &&
            this.feedbackTo == other.getFeedbackTo() &&
            this.feedbackId == other.getFeedbackId();
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
        _hashCode += new Long(getFeedbackRowId()).hashCode();
        if (getFeedbackChangeType() != null) {
            _hashCode += getFeedbackChangeType().hashCode();
        }
        _hashCode += new Long(getFeedbackChangeDate()).hashCode();
        _hashCode += getFeedbackFrom();
        _hashCode += getFeedbackTo();
        _hashCode += getFeedbackId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SiteJournalFeedbacks.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournalFeedbacks"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedbackRowId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feedback-row-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedbackChangeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feedback-change-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedbackChangeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feedback-change-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedbackFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feedback-from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedbackTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feedback-to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedbackId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feedback-id"));
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
