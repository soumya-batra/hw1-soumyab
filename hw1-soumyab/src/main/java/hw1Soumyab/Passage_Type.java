
/* First created by JCasGen Thu Sep 12 01:01:27 EDT 2013 */
package hw1Soumyab;

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

/** Type for passage retrieved from a document
 * Updated by JCasGen Thu Sep 12 01:01:27 EDT 2013
 * @generated */
public class Passage_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Passage_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Passage_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Passage(addr, Passage_Type.this);
  			   Passage_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Passage(addr, Passage_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Passage.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("hw1Soumyab.Passage");
 
  /** @generated */
  final Feature casFeat_passageNo;
  /** @generated */
  final int     casFeatCode_passageNo;
  /** @generated */ 
  public int getPassageNo(int addr) {
        if (featOkTst && casFeat_passageNo == null)
      jcas.throwFeatMissing("passageNo", "hw1Soumyab.Passage");
    return ll_cas.ll_getIntValue(addr, casFeatCode_passageNo);
  }
  /** @generated */    
  public void setPassageNo(int addr, int v) {
        if (featOkTst && casFeat_passageNo == null)
      jcas.throwFeatMissing("passageNo", "hw1Soumyab.Passage");
    ll_cas.ll_setIntValue(addr, casFeatCode_passageNo, v);}
    
  
 
  /** @generated */
  final Feature casFeat_source;
  /** @generated */
  final int     casFeatCode_source;
  /** @generated */ 
  public int getSource(int addr) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "hw1Soumyab.Passage");
    return ll_cas.ll_getRefValue(addr, casFeatCode_source);
  }
  /** @generated */    
  public void setSource(int addr, int v) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "hw1Soumyab.Passage");
    ll_cas.ll_setRefValue(addr, casFeatCode_source, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Passage_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_passageNo = jcas.getRequiredFeatureDE(casType, "passageNo", "uima.cas.Integer", featOkTst);
    casFeatCode_passageNo  = (null == casFeat_passageNo) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_passageNo).getCode();

 
    casFeat_source = jcas.getRequiredFeatureDE(casType, "source", "hw1Soumyab.Annotator", featOkTst);
    casFeatCode_source  = (null == casFeat_source) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_source).getCode();

  }
}



    