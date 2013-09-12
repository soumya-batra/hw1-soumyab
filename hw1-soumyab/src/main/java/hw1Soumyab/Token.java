

/* First created by JCasGen Thu Sep 12 01:01:27 EDT 2013 */
package hw1Soumyab;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Type for individual tokens of a sentence
 * Updated by JCasGen Thu Sep 12 01:01:27 EDT 2013
 * XML source: C:/eclipse/Soumya/workspace/hw1-soumyab/src/main/resources/hw1-soumyab-typesystem.xml
 * @generated */
public class Token extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
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
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Token(JCas jcas, int begin, int end) {
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
  //* Feature: source

  /** getter for source - gets Annotator details that annotated the token
   * @generated */
  public Annotator getSource() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "hw1Soumyab.Token");
    return (Annotator)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Token_Type)jcasType).casFeatCode_source)));}
    
  /** setter for source - sets Annotator details that annotated the token 
   * @generated */
  public void setSource(Annotator v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "hw1Soumyab.Token");
    jcasType.ll_cas.ll_setRefValue(addr, ((Token_Type)jcasType).casFeatCode_source, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    