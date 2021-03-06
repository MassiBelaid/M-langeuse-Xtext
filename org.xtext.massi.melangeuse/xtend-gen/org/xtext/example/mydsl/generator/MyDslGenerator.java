/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.generator;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.example.mydsl.myDsl.Feature;
import org.xtext.example.mydsl.myDsl.Model;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MyDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final Model model = ((Model) _head);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import fr.uha.ensisa.idm.mixin.sim.svg.SVGMixingMachine;");
    _builder.newLine();
    _builder.append("public class Main extends SVGMixingMachine {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public int run (){\t");
    _builder.newLine();
    {
      EList<Feature> _features = model.getFeatures();
      for(final Feature t : _features) {
        {
          String _fun = t.getFun();
          boolean _equals = Objects.equal(_fun, "scan");
          if (_equals) {
            _builder.append("\t");
            _builder.append("if(scan() ");
            String _comp = t.getComp();
            _builder.append(_comp, "\t");
            _builder.append("  ");
            int _value = t.getValue();
            _builder.append(_value, "\t");
            _builder.append(") return ");
            int _valuereturn = t.getValuereturn();
            _builder.append(_valuereturn, "\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t");
            String _fun_1 = t.getFun();
            _builder.append(_fun_1, "\t");
            _builder.append("(");
            int _value_1 = t.getValue();
            _builder.append(_value_1, "\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("return 0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Main main = new Main();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for (int i = 1; i <= main.getInputCups(); ++i){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("main.setAtInputCup(i,9);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("main.run();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    fsa.generateFile("Main.java", _builder);
  }
}
