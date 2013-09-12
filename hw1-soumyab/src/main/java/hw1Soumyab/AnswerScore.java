

/* First created by JCasGen Thu Sep 12 01:01:27 EDT 2013 */
package hw1Soumyab;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Type for Answer Score after mixing results from all annotators for an answer
 * Updated by JCasGen Thu Sep 12 01:01:27 EDT 2013
 * XML source: C:/eclipse/Soumya/workspace/hw1-soumyab/src/main/resources/hw1-soumyab-typesystem.xml
 * @generated */
public class AnswerScore extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerScore.class);
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
  protected AnswerScore() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnswerScore(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnswerScore(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AnswerScore(JCas jcas, int begin, int end) {
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

  /** getter for source - gets Analysis Engine Details that generated the overall score for an answer
   * @generated */
  public Annotator getSource() {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "hw1Soumyab.AnswerScore");
    return (Annotator)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_source)));}
    
  /** setter for source - sets Analysis Engine Details that generated the overall score for an answer 
   * @generated */
  public void setSource(Annotator v) {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "hw1Soumyab.AnswerScore");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_source, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets Answer Score generated for an Answer
   * @generated */
  public double getScore() {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "hw1Soumyab.AnswerScore");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets Answer Score generated for an Answer 
   * @generated */
  public void setScore(double v) {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "hw1Soumyab.AnswerScore");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: answerSentence

  /** getter for answerSentence - gets Answer Sentence for which the score is calculated
   * @generated */
  public Answer getAnswerSentence() {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_answerSentence == null)
      jcasType.jcas.throwFeatMissing("answerSentence", "hw1Soumyab.AnswerScore");
    return (Answer)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_answerSentence)));}
    
  /** setter for answerSentence - sets Answer Sentence for which the score is calculated 
   * @generated */
  public void setAnswerSentence(Answer v) {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_answerSentence == null)
      jcasType.jcas.throwFeatMissing("answerSentence", "hw1Soumyab.AnswerScore");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_answerSentence, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    