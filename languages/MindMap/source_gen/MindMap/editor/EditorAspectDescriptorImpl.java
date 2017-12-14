package MindMap.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt_a0a = ((SAbstractConcept) concept);
    switch (index_xbvbvu_a0a.index(cncpt_a0a)) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new CentralTopic_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new MainTopic_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new Mindmap_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new SubTopic_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }



  private static final ConceptSwitchIndex index_xbvbvu_a0a = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x8e85de6d521a4a74L, 0x94fc793b12682f6eL, 0x3d10348ce68f12aaL), MetaIdFactory.conceptId(0x8e85de6d521a4a74L, 0x94fc793b12682f6eL, 0x3d10348ce68f12bbL), MetaIdFactory.conceptId(0x8e85de6d521a4a74L, 0x94fc793b12682f6eL, 0x3d10348ce68f127fL), MetaIdFactory.conceptId(0x8e85de6d521a4a74L, 0x94fc793b12682f6eL, 0x3d10348ce68f12c6L)).seal();
}
