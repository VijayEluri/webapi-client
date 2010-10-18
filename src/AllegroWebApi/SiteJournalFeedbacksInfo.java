/**
 * SiteJournalFeedbacksInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package AllegroWebApi;

public class SiteJournalFeedbacksInfo  implements java.io.Serializable {
    private int feedbackNumber;

    private long lastFeedbackDate;

    public SiteJournalFeedbacksInfo() {
    }

    public SiteJournalFeedbacksInfo(
           int feedbackNumber,
           long lastFeedbackDate) {
           this.feedbackNumber = feedbackNumber;
           this.lastFeedbackDate = lastFeedbackDate;
    }


    /**
     * Gets the feedbackNumber value for this SiteJournalFeedbacksInfo.
     * 
     * @return feedbackNumber
     */
    public int getFeedbackNumber() {
        return feedbackNumber;
    }


    /**
     * Sets the feedbackNumber value for this SiteJournalFeedbacksInfo.
     * 
     * @param feedbackNumber
     */
    public void setFeedbackNumber(int feedbackNumber) {
        this.feedbackNumber = feedbackNumber;
    }


    /**
     * Gets the lastFeedbackDate value for this SiteJournalFeedbacksInfo.
     * 
     * @return lastFeedbackDate
     */
    public long getLastFeedbackDate() {
        return lastFeedbackDate;
    }


    /**
     * Sets the lastFeedbackDate value for this SiteJournalFeedbacksInfo.
     * 
     * @param lastFeedbackDate
     */
    public void setLastFeedbackDate(long lastFeedbackDate) {
        this.lastFeedbackDate = lastFeedbackDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SiteJournalFeedbacksInfo)) return false;
        SiteJournalFeedbacksInfo other = (SiteJournalFeedbacksInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.feedbackNumber == other.getFeedbackNumber() &&
            this.lastFeedbackDate == other.getLastFeedbackDate();
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
        _hashCode += getFeedbackNumber();
        _hashCode += new Long(getLastFeedbackDate()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SiteJournalFeedbacksInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournalFeedbacksInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedbackNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feedback-number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastFeedbackDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "last-feedback-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
