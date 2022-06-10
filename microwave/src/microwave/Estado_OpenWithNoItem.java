package microwave;

import microwave.Estado_Microondas.state;

public class Estado_OpenWithNoItem extends Estado_Microondas{
	protected Estado_OpenWithNoItem () {
		fase= state.OpenWithNoItem;
	}
	@Override
	 protected Microwave door_closed (Microwave m) {
		
		
		return new Microwave();
	}
	@Override
	protected Microwave item_placed (Microwave m) {
		m.withItem=true;
		m.estado= new Estado_OpenWithItem();
		
		return m;
	}

}
