

/* First created by JCasGen Thu Sep 12 01:01:27 EDT 2013 */
package hw1Soumyab;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.DocumentAnnotation;
import org.apache.uima.jcas.tcas.Annotation;


/** Type for Input Document file
 * Updated by JCasGen Thu Sep 12 01:01:27 EDT 2013
 * XML source: C:/eclipse/Soumya/workspace/hw1-soumyab/src/main/resources/hw1-soumyab-typesystem.xml
 * @generated */
public class Document extends DocumentAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Document.class);
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
  protected Document() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Document(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Document(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Document(JCas jcas, int begin, int end) {
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
  //* Feature: noOfPassages

  /** getter for noOfPassages - gets Total number of passages in the document
   * @generated */
  public int getNoOfPassages() {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_noOfPassages == null)
      jcasType.jcas.throwFeatMissing("noOfPassages", "hw1Soumyab.Document");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Document_Type)jcasType).casFeatCode_noOfPassages);}
    
  /** setter for noOfPassages - sets Total number of passages in the document 
   * @generated */
  public void setNoOfPassages(int v) {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_noOfPassages == null)
      jcasType.jcas.throwFeatMissing("noOfPassages", "hw1Soumyab.Document");
    jcasType.ll_cas.ll_setIntValue(addr, ((Document_Type)jcasType).casFeatCode_noOfPassages, v);}    
   
    
  //*--------------*
  //* Feature: passageBounds

  /** getter for passageBounds - gets Defines Passage Bounds (Begin and End indices) of each passage
   * @generated */
  public FSArray getPassageBounds() {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_passageBounds == null)
      jcasType.jcas.throwFeatMissing("passageBounds", "hw1Soumyab.Document");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Document_Type)jcasType).casFeatCode_passageBounds)));}
    
  /** setter for passageBounds - sets Defines Passage Bounds (Begin and End indices) of each passage 
   * @generated */
  public void setPassageBounds(FSArray v) {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_passageBounds == null)
      jcasType.jcas.throwFeatMissing("passageBounds", "hw1Soumyab.Document");
    jcasType.ll_cas.ll_setRefValue(addr, ((Document_Type)jcasType).casFeatCode_passageBounds, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for passageBounds - gets an indexed value - Defines Passage Bounds (Begin and End indices) of each passage
   * @generated */
  public Annotation getPassageBounds(int i) {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_passageBounds == null)
      jcasType.jcas.throwFeatMissing("passageBounds", "hw1Soumyab.Document");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Document_Type)jcasType).casFeatCode_passageBounds), i);
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Document_Type)jcasType).casFeatCode_passageBounds), i)));}

  /** indexed setter for passageBounds - sets an indexed value - Defines Passage Bounds (Begin and End indices) of each passage
   * @generated */
  public void setPassageBounds(int i, Annotation v) { 
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_passageBounds == null)
      jcasType.jcas.throwFeatMissing("passageBounds", "hw1Soumyab.Document");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Document_Type)jcasType).casFeatCode_passageBounds), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Document_Type)jcasType).casFeatCode_passageBounds), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    