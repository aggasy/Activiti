/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.activiti.editor.language.bpmn.parser;

import org.activiti.editor.language.bpmn.model.BaseElement;
import org.activiti.editor.language.bpmn.model.ScriptTask;

/**
 * @author Tijs Rademakers
 */
public class ScriptTaskParser extends BaseBpmnElementParser {
  
	public ScriptTaskParser() {
		ScriptTextParser scriptTextParser = new ScriptTextParser();
		childElementParsers.put(scriptTextParser.getElementName(), scriptTextParser);
	}
	
  public static String getElementName() {
    return "scriptTask";
  }

  protected BaseElement parseElement() {
  	ScriptTask scriptTask = new ScriptTask();
		scriptTask.setScriptFormat(xtr.getAttributeValue(null, "scriptFormat"));
		parseChildElements(getElementName(), scriptTask);
		return scriptTask;
  }
}