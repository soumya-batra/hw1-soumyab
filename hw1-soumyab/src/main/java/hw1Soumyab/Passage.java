

/* First created by JCasGen Thu Sep 12 01:01:27 EDT 2013 */
package hw1Soumyab;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Type for passage retrieved from a document
 * Updated by JCasGen Thu Sep 12 01:01:27 EDT 2013
 * XML source: C:/eclipse/Soumya/workspace/hw1-soumyab/src/main/resources/hw1-soumyab-typesystem.xml
 * @generated */
public class Passage extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Passage.class);
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
  protected Passage() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Passage(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Passage(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Passage(JCas jcas, int begin, int end) {
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
  //* Feature: passageNo

  /** getter for passageNo - gets Passage Number in the document
   * @generated */
  public int getPassageNo() {
    if (Passage_Type.featOkTst && ((Passage_Type)jcasType).casFeat_passageNo == null)
      jcasType.jcas.throwFeatMissing("passageNo", "hw1Soumyab.Passage");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Passage_Type)jcasType).casFeatCode_passageNo);}
    
  /** setter for passageNo - sets Passage Number in the document 
   * @generated */
  public void setPassageNo(int v) {
    if (Passage_Type.featOkTst && ((Passage_Type)jcasType).casFeat_passageNo == null)
      jcasType.jcas.throwFeatMissing("passageNo", "hw1Soumyab.Passage");
    jcasType.ll_cas.ll_setIntValue(addr, ((Passage_Type)jcasType).casFeatCode_passageNo, v);}    
   
    
  //*--------------*
  //* Feature: source

  /** getter for source - gets Annotator details that annotated the passage
   * @generated */
  public Annotator getSource() {
    if (Passage_Type.featOkTst && ((Passage_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "hw1Soumyab.Passage");
    return (Annotator)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Passage_Type)jcasType).casFeatCode_source)));}
    
  /** setter for source - sets Annotator details that annotated the passage 
   * @generated */
  public void setSource(Annotator v) {
    if (Passage_Type.featOkTst && ((Passage_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "hw1Soumyab.Passage");
    jcasType.ll_cas.ll_setRefValue(addr, ((Passage_Type)jcasType).casFeatCode_source, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    