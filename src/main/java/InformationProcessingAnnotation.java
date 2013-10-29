

/* First created by JCasGen Wed Sep 11 20:14:02 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** base annotation
 * Updated by JCasGen Wed Sep 11 21:03:59 EDT 2013
 * XML source: /Users/tengda/Documents/workspace/hw1-dateng/src/main/resources/hw1-dateng-typesystem.xml
 * @generated */
public class InformationProcessingAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(InformationProcessingAnnotation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected InformationProcessingAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public InformationProcessingAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public InformationProcessingAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public InformationProcessingAnnotation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: producedBy

  /** getter for producedBy - gets 
   * @generated */
  public String getProducedBy() {
    if (InformationProcessingAnnotation_Type.featOkTst && ((InformationProcessingAnnotation_Type)jcasType).casFeat_producedBy == null)
      jcasType.jcas.throwFeatMissing("producedBy", "InformationProcessingAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((InformationProcessingAnnotation_Type)jcasType).casFeatCode_producedBy);}
    
  /** setter for producedBy - sets  
   * @generated */
  public void setProducedBy(String v) {
    if (InformationProcessingAnnotation_Type.featOkTst && ((InformationProcessingAnnotation_Type)jcasType).casFeat_producedBy == null)
      jcasType.jcas.throwFeatMissing("producedBy", "InformationProcessingAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((InformationProcessingAnnotation_Type)jcasType).casFeatCode_producedBy, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets 
   * @generated */
  public double getConfidence() {
    if (InformationProcessingAnnotation_Type.featOkTst && ((InformationProcessingAnnotation_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "InformationProcessingAnnotation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((InformationProcessingAnnotation_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets  
   * @generated */
  public void setConfidence(double v) {
    if (InformationProcessingAnnotation_Type.featOkTst && ((InformationProcessingAnnotation_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "InformationProcessingAnnotation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((InformationProcessingAnnotation_Type)jcasType).casFeatCode_confidence, v);}    
  }

    