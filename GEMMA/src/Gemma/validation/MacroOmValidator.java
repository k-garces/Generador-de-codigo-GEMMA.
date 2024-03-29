/**
 *
 * $Id$
 */
package Gemma.validation;

import Gemma.Om;
import Gemma.TipoMacroOm;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link Gemma.MacroOm}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MacroOmValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateTipo(TipoMacroOm value);
	boolean validateOms(EList<Om> value);
}
