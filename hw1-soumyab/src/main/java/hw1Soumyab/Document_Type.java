
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
import org.apache.uima.jcas.tcas.DocumentAnnotation_Type;

/** Type for Input Document file
 * Updated by JCasGen Thu Sep 12 01:01:27 EDT 2013
 * @generated */
public class Document_Type extends DocumentAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Document_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Document_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Document(addr, Document_Type.this);
  			   Document_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Document(addr, Document_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Document.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("hw1Soumyab.Document");
 
  /** @generated */
  final Feature casFeat_noOfPassages;
  /** @generated */
  final int     casFeatCode_noOfPassages;
  /** @generated */ 
  public int getNoOfPassages(int addr) {
        if (featOkTst && casFeat_noOfPassages == null)
      jcas.throwFeatMissing("noOfPassages", "hw1Soumyab.Document");
    return ll_cas.ll_getIntValue(addr, casFeatCode_noOfPassages);
  }
  /** @generated */    
  public void setNoOfPassages(int addr, int v) {
        if (featOkTst && casFeat_noOfPassages == null)
      jcas.throwFeatMissing("noOfPassages", "hw1Soumyab.Document");
    ll_cas.ll_setIntValue(addr, casFeatCode_noOfPassages, v);}
    
  
 
  /** @generated */
  final Feature casFeat_passageBounds;
  /** @generated */
  final int     casFeatCode_passageBounds;
  /** @generated */ 
  public int getPassageBounds(int addr) {
        if (featOkTst && casFeat_passageBounds == null)
      jcas.throwFeatMissing("passageBounds", "hw1Soumyab.Document");
    return ll_cas.ll_getRefValue(addr, casFeatCode_passageBounds);
  }
  /** @generated */    
  public void setPassageBounds(int addr, int v) {
        if (featOkTst && casFeat_passageBounds == null)
      jcas.throwFeatMissing("passageBounds", "hw1Soumyab.Document");
    ll_cas.ll_setRefValue(addr, casFeatCode_passageBounds, v);}
    
   /** @generated */
  public int getPassageBounds(int addr, int i) {
        if (featOkTst && casFeat_passageBounds == null)
      jcas.throwFeatMissing("passageBounds", "hw1Soumyab.Document");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_passageBounds), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_passageBounds), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_passageBounds), i);
  }
   
  /** @generated */ 
  public void setPassageBounds(int addr, int i, int v) {
        if (featOkTst && casFeat_passageBounds == null)
      jcas.throwFeatMissing("passageBounds", "hw1Soumyab.Document");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_passageBounds), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_passageBounds), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_passageBounds), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Document_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_noOfPassages = jcas.getRequiredFeatureDE(casType, "noOfPassages", "uima.cas.Integer", featOkTst);
    casFeatCode_noOfPassages  = (null == casFeat_noOfPassages) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_noOfPassages).getCode();

 
    casFeat_passageBounds = jcas.getRequiredFeatureDE(casType, "passageBounds", "uima.cas.FSArray", featOkTst);
    casFeatCode_passageBounds  = (null == casFeat_passageBounds) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_passageBounds).getCode();

  }
}



    