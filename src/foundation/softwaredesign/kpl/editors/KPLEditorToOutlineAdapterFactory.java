package foundation.softwaredesign.kpl.editors;

import org.eclipse.core.runtime.IAdapterFactory;

public class KPLEditorToOutlineAdapterFactory implements IAdapterFactory {

	 
   @Override
   public Class<?>[] getAdapterList() {
      return new Class<?>[] { /* TODO */ };
   }

	@Override
	public <T> T getAdapter(Object adaptableObject, Class<T> required) {
		return null;
		/* TODO 
		if (IContentOutlinePage.class.equals(required)) {
            KPLEditor editor = (KPLEditor)adaptableObject;
            return new CoolLanguageContentOutlinePage(...);
         }
         */
      
	}

}
