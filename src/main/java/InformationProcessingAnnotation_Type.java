
/* First created by JCasGen Wed Sep 11 20:14:02 EDT 2013 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** base annotation
 * Updated by JCasGen Wed Sep 11 21:03:59 EDT 2013
 * @generated */
public class InformationProcessingAnnotation_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (InformationProcessingAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = InformationProcessingAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new InformationProcessingAnnotation(addr, InformationProcessingAnnotation_Type.this);
  			   InformationProcessingAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new InformationProcessingAnnotation(addr, InformationProcessingAnnotation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = InformationProcessingAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("InformationProcessingAnnotation");
 
  /** @generated */
  final Feature casFeat_producedBy;
  /** @generated */
  final int     casFeatCode_producedBy;
  /** @generated */ 
  public String getProducedBy(int addr) {
        if (featOkTst && casFeat_producedBy == null)
      jcas.throwFeatMissing("producedBy", "InformationProcessingAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_producedBy);
  }
  /** @generated */    
  public void setProducedBy(int addr, String v) {
        if (featOkTst && casFeat_producedBy == null)
      jcas.throwFeatMissing("producedBy", "InformationProcessingAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_producedBy, v);}
    
  
 
  /** @generated */
  final Feature casFeat_confidence;
  /** @generated */
  final int     casFeatCode_confidence;
  /** @generated */ 
  public double getConfidence(int addr) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "InformationProcessingAnnotation");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_confidence);
  }
  /** @generated */    
  public void setConfidence(int addr, double v) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "InformationProcessingAnnotation");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_confidence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public InformationProcessingAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_producedBy = jcas.getRequiredFeatureDE(casType, "producedBy", "uima.cas.String", featOkTst);
    casFeatCode_producedBy  = (null == casFeat_producedBy) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_producedBy).getCode();

 
    casFeat_confidence = jcas.getRequiredFeatureDE(casType, "confidence", "uima.cas.Double", featOkTst);
    casFeatCode_confidence  = (null == casFeat_confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence).getCode();

  }
}



    