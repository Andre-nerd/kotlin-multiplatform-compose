//
//  ContentView.swift
//  iosApp
//
//  Created by Andrey Boukreev on 17.06.2024.
//

import SwiftUI
import shared

struct ContentView: View {
    var body: some View {
        ComposeView()
    }
}
struct ComposeView:UIViewControllerRepresentable{
    func updateUIViewController(_ uiViewController: UIViewControllerType, context: Context) {
    }
    
    func makeUIViewController(context: Context) -> some UIViewController {
        RootViewKt.MainViewController()
    }
}
    


