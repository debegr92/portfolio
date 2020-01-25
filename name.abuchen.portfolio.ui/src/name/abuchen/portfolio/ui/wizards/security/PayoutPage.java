package name.abuchen.portfolio.ui.wizards.security;

import java.text.SimpleDateFormat;

import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import name.abuchen.portfolio.ui.Images;
import name.abuchen.portfolio.ui.Messages;
import name.abuchen.portfolio.ui.util.BindingHelper;
import name.abuchen.portfolio.ui.util.SWTHelper;

public class PayoutPage extends AbstractPage
{
    private final EditSecurityModel model;
    private final BindingHelper bindings;
    
    protected PayoutPage(EditSecurityModel model, BindingHelper bindings)
    {
        this.model = model;
        this.bindings = bindings;

        setTitle(Messages.EditWizardPayoutTitle);
    }
    
    @Override
    public void createControl(Composite parent)
    {
        Composite container = new Composite(parent, SWT.NULL);
        setControl(container);
        GridLayoutFactory.fillDefaults().numColumns(2).margins(5, 5).applyTo(container);
        
        bindings.bindQuoteInput(container, "Jan", "payoutJan"); //$NON-NLS-1$ //$NON-NLS-2$
        bindings.bindQuoteInput(container, "Feb", "payoutFeb"); //$NON-NLS-1$ //$NON-NLS-2$
        bindings.bindQuoteInput(container, "Mar", "payoutMar"); //$NON-NLS-1$ //$NON-NLS-2$
        bindings.bindQuoteInput(container, "Apr", "payoutApr"); //$NON-NLS-1$ //$NON-NLS-2$
        bindings.bindQuoteInput(container, "May", "payoutMay"); //$NON-NLS-1$ //$NON-NLS-2$
        bindings.bindQuoteInput(container, "Jun", "payoutJun"); //$NON-NLS-1$ //$NON-NLS-2$
        bindings.bindQuoteInput(container, "Jul", "payoutJul"); //$NON-NLS-1$ //$NON-NLS-2$
        bindings.bindQuoteInput(container, "Aug", "payoutAug"); //$NON-NLS-1$ //$NON-NLS-2$
        bindings.bindQuoteInput(container, "Sep", "payoutSep"); //$NON-NLS-1$ //$NON-NLS-2$
        bindings.bindQuoteInput(container, "Oct", "payoutOct"); //$NON-NLS-1$ //$NON-NLS-2$
        bindings.bindQuoteInput(container, "Nov", "payoutNov"); //$NON-NLS-1$ //$NON-NLS-2$
        bindings.bindQuoteInput(container, "Dec", "payoutDec"); //$NON-NLS-1$ //$NON-NLS-2$
    }
}
