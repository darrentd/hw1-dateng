package TypeSystem;


/* First created by JCasGen Wed Sep 11 20:14:02 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Wed Sep 11 21:03:59 EDT 2013
 * XML source: /Users/tengda/Documents/workspace/hw1-dateng/src/main/resources/hw1-dateng-typesystem.xml
 * @generated */
public class NGram extends InformationProcessingAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGram.class);
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
  protected NGram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NGram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NGram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NGram(JCas jcas, int begin, int end) {
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
  //* Feature: tokens

  /** getter for tokens - gets 
   * @generated */
  public FSArray getTokens() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "NGram");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokens)));}
    
  /** setter for tokens - sets  
   * @generated */
  public void setTokens(FSArray v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "NGram");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokens, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for tokens - gets an indexed value - 
   * @generated */
  public Token getTokens(int i) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "NGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokens), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokens), i)));}

  /** indexed setter for tokens - sets an indexed value - 
   * @generated */
  public void setTokens(int i, Token v) { 
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "NGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokens), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokens), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    