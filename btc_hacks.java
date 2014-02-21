import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import java.security.spec.ECField;
import java.security.spec.ECPoint;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.spongycastle.math.ec.ECAlgorithms;

import com.google.bitcoin.core.Address;
import com.google.bitcoin.core.ECKey;
import com.google.bitcoin.core.Transaction;
import com.google.bitcoin.core.Wallet;
import com.google.bitcoin.crypto.*;
import com.google.bitcoin.store.UnreadableWalletException;
import com.google.bitcoin.store.WalletProtobufSerializer;
import com.google.bitcoin.utils.Threading;
import com.google.bitcoin.wallet.WalletFiles;


class BtcHacks {
    public static void main(String[] args) {
        // run();
    }
    public static void run() {
        ECKey key = new ECKey();
        ECPoint p = new EC
    }






    public static void print() {
        System.out.println("HURR");
}

