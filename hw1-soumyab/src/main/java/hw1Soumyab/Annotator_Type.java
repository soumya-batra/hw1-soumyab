
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
import org.apache.uima.jcas.cas.TOP_Type;

/** Type containing details about Annotator name and the corresponding confidence value produced by it
 * Updated by JCasGen Thu Sep 12 01:01:27 EDT 2013
 * @generated */
public class Annotator_Type extends TOP_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Annotator_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Annotator_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Annotator(addr, Annotator_Type.this);
  			   Annotator_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Annotator(addr, Annotator_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Annotator.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("hw1Soumyab.Annotator");
 
  /** @generated */
  final Feature casFeat_componentID;
  /** @generated */
  final int     casFeatCode_componentID;
  /** @generated */ 
  public String getComponentID(int addr) {
        if (featOkTst && casFeat_componentID == null)
      jcas.throwFeatMissing("componentID", "hw1Soumyab.Annotator");
    return ll_cas.ll_getStringValue(addr, casFeatCode_componentID);
  }
  /** @generated */    
  public void setComponentID(int addr, String v) {
        if (featOkTst && casFeat_componentID == null)
      jcas.throwFeatMissing("componentID", "hw1Soumyab.Annotator");
    ll_cas.ll_setStringValue(addr, casFeatCode_componentID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_confidence;
  /** @generated */
  final int     casFeatCode_confidence;
  /** @generated */ 
  public double getConfidence(int addr) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "hw1Soumyab.Annotator");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_confidence);
  }
  /** @generated */    
  public void setConfidence(int addr, double v) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "hw1Soumyab.Annotator");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_confidence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Annotator_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_componentID = jcas.getRequiredFeatureDE(casType, "componentID", "uima.cas.String", featOkTst);
    casFeatCode_componentID  = (null == casFeat_componentID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_componentID).getCode();

 
    casFeat_confidence = jcas.getRequiredFeatureDE(casType, "confidence", "uima.cas.Double", featOkTst);
    casFeatCode_confidence  = (null == casFeat_confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence).getCode();

  }
}



    