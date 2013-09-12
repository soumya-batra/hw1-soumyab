

/* First created by JCasGen Thu Sep 12 01:01:26 EDT 2013 */
package hw1Soumyab;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** Type containing details about Annotator name and the corresponding confidence value produced by it
 * Updated by JCasGen Thu Sep 12 01:01:26 EDT 2013
 * XML source: C:/eclipse/Soumya/workspace/hw1-soumyab/src/main/resources/hw1-soumyab-typesystem.xml
 * @generated */
public class Annotator extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Annotator.class);
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
  protected Annotator() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Annotator(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Annotator(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: componentID

  /** getter for componentID - gets Annotator Name and Description
   * @generated */
  public String getComponentID() {
    if (Annotator_Type.featOkTst && ((Annotator_Type)jcasType).casFeat_componentID == null)
      jcasType.jcas.throwFeatMissing("componentID", "hw1Soumyab.Annotator");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Annotator_Type)jcasType).casFeatCode_componentID);}
    
  /** setter for componentID - sets Annotator Name and Description 
   * @generated */
  public void setComponentID(String v) {
    if (Annotator_Type.featOkTst && ((Annotator_Type)jcasType).casFeat_componentID == null)
      jcasType.jcas.throwFeatMissing("componentID", "hw1Soumyab.Annotator");
    jcasType.ll_cas.ll_setStringValue(addr, ((Annotator_Type)jcasType).casFeatCode_componentID, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets Confidence value produced by the annotator
   * @generated */
  public double getConfidence() {
    if (Annotator_Type.featOkTst && ((Annotator_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "hw1Soumyab.Annotator");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Annotator_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets Confidence value produced by the annotator 
   * @generated */
  public void setConfidence(double v) {
    if (Annotator_Type.featOkTst && ((Annotator_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "hw1Soumyab.Annotator");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Annotator_Type)jcasType).casFeatCode_confidence, v);}    
  }

    